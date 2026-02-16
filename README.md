# Java8からJava11への移行に伴って隠蔽された内部APIを参照可能にする方法

## テストクラス
DirectCheckExtended

## コンパイル
``` shell
javac \
--add-exports java.base/sun.nio.cs=ALL-UNNAMED \
--add-exports java.base/sun.nio.ch=ALL-UNNAMED \
--add-exports java.base/sun.security.util=ALL-UNNAMED \
--add-exports java.base/sun.security.x509=ALL-UNNAMED \
--add-exports java.base/sun.security.action=ALL-UNNAMED \
--add-exports java.base/sun.net.www.protocol.http=ALL-UNNAMED \
--add-exports java.base/sun.net.www.protocol.https=ALL-UNNAMED \
--add-exports java.base/com.sun.crypto.provider=ALL-UNNAMED \
--add-exports java.xml/com.sun.org.apache.xpath.internal=ALL-UNNAMED \
--add-exports java.xml/com.sun.org.apache.xerces.internal.parsers=ALL-UNNAMED \
DirectCheckExtended.java
```

## 実行
```shell
java \
--illegal-access=deny \
--add-exports java.base/sun.nio.cs=ALL-UNNAMED \
--add-exports java.base/sun.nio.ch=ALL-UNNAMED \
--add-exports java.base/sun.security.util=ALL-UNNAMED \
--add-exports java.base/sun.security.x509=ALL-UNNAMED \
--add-exports java.base/sun.security.action=ALL-UNNAMED \
--add-exports java.base/sun.net.www.protocol.http=ALL-UNNAMED \
--add-exports java.base/sun.net.www.protocol.https=ALL-UNNAMED \
--add-exports java.base/com.sun.crypto.provider=ALL-UNNAMED \
--add-exports java.xml/com.sun.org.apache.xpath.internal=ALL-UNNAMED \
--add-exports java.xml/com.sun.org.apache.xerces.internal.parsers=ALL-UNNAMED \
DirectCheckExtended
```
