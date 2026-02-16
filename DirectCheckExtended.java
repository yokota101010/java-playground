// NIO関連
import sun.nio.cs.Surrogate;
import sun.nio.cs.StreamDecoder;
import sun.nio.ch.DirectBuffer;
import sun.nio.ch.SelChImpl;

// Security関連
import sun.security.util.Debug;
import sun.security.x509.X500Name;
import sun.security.action.GetPropertyAction;

// Network関連
import sun.net.www.protocol.http.HttpURLConnection;
import sun.net.www.protocol.https.HttpsURLConnectionImpl;

// Crypto関連
import com.sun.crypto.provider.SunJCE;

// XML関連
import com.sun.org.apache.xpath.internal.XPathAPI;
// 【修正】Version ではなく SAXParser をインポート
import com.sun.org.apache.xerces.internal.parsers.SAXParser; 

public class DirectCheckExtended {
    public static void main(String[] args) {
        System.out.println("=== 拡張版: 内部API直接アクセスチェック (SAXParser版) ===");
        
        try {
            check("sun.nio.cs.Surrogate", Surrogate.class);
            check("sun.nio.cs.StreamDecoder", StreamDecoder.class);
            check("sun.nio.ch.DirectBuffer", DirectBuffer.class);
            check("sun.nio.ch.SelChImpl", SelChImpl.class);
            
            check("sun.security.util.Debug", Debug.class);
            check("sun.security.x509.X500Name", X500Name.class);
            check("sun.security.action.GetPropertyAction", GetPropertyAction.class);
            
            check("sun.net.www.protocol.http.HttpURLConnection", HttpURLConnection.class);
            check("sun.net.www.protocol.https.HttpsURLConnectionImpl", HttpsURLConnectionImpl.class);
            
            check("com.sun.crypto.provider.SunJCE", SunJCE.class);
            
            check("com.sun.org.apache.xpath.internal.XPathAPI", XPathAPI.class);

            // 【修正】ここも Version.class から SAXParser.class に変更
            check("com.sun.org.apache.xerces.internal.parsers.SAXParser", SAXParser.class);

        } catch (Throwable t) {
            System.out.println("\n[致命的エラー] 予期せぬ例外が発生しました: " + t);
            t.printStackTrace();
        }
        System.out.println("=== チェック終了 ===");
    }

    private static void check(String name, Class<?> clazz) {
        System.out.printf("[OK] %-55s -> %s\n", name, clazz.getName());
    }
}
