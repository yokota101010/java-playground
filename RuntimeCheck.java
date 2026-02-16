// リフレクションではありません。直接インポートしています。
import sun.nio.ch.Net; 

public class RuntimeCheck {
    public static void main(String[] args) {
        System.out.println("=== 実行時アクセス権限チェック開始 ===");

        try {
            // ここで隠蔽クラスにアクセスします。
            // 権限がない場合、Java VM が 'IllegalAccessError' を投げます。
            String className = Net.class.getName();
            
            System.out.println("成功: クラスにアクセスできました -> " + className);
            
        } catch (IllegalAccessError e) {
            // オプションがない場合、ここに来ます
            System.out.println("失敗: アクセス権限がありません！");
            System.out.println("エラー内容: " + e.toString());
        } catch (Throwable t) {
            System.out.println("予期せぬエラー: " + t.toString());
        }

        System.out.println("=== チェック終了 ===");
    }
}