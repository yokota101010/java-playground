# .idx/dev.nix
{ pkgs, ... }: {
  # 安定版のチャンネルを利用
  channel = "stable-24.05"; # または最新の安定版

  # Linux環境にインストールするパッケージ
  packages = [
    pkgs.jdk17        # Java 17 (21が良い場合は pkgs.jdk21)
    pkgs.maven       # ビルドツール
  ];

  # VS Code (IDX) の設定
  idx = {
    # 自動インストールする拡張機能
    extensions = [
      "vscjava.vscode-java-pack"  # Java開発必須セット
    ];

    # プレビュー設定（コンソールアプリなら不要だが、Webアプリならここで設定）
    previews = {};
  };
}
