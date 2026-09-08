# 一言メモアプリ 学習メモ

## ControllerからDBまでのつながり

### 分からなかったこと

- リクエストからデータベースまでのデータの流れ
- 送信されたデータをどこで受け取り、どのような流れでDBへ送るのか
- DBから取得した結果が、どのような流れで呼び出し元へ返されるのか

### 現在の理解

Spring BootのWebアプリでは、Controllerが外部から送られたリクエストを最初に受け取り、
リクエストの内容に対応する処理へつなぐ窓口になる。

現在はフロントエンド作成前のため、Postmanを使用してリクエストを送信し、動作を確認している。

【リクエストの流れ】

```text
Postman
メモの一覧を取得したい/メモを保存したい
↓
MemoController（受付窓口）
リクエストを受け取り、Repositoryを呼び出す
↓
MemoRepository（DB操作担当）
MySQLに対してデータの取得または保存を行う
↓
MySQL（データの保管庫）
メモのデータを取得または保存し、結果を返す
```
```text
リクエスト：Postman → Controller → Repository → MySQL  
     結果 ：Postman ← Controller ← Repository ← MySQL
```
このように、リクエストを送る流れと、処理結果が呼び出し元へ返る流れの往復になる。

※Serviceは、必ず必要なものではなく、Controllerに書く処理や条件判断が複雑になってきたときに、役割を分けるために使う。
今回は小規模アプリのため、ControllerからRepositoryを直接呼び出す構成としている。

### コードの意味

- `@GetMapping`
  GETが来たら、この処理を動かす目印

-  `memoRepository.findAll()`
  Repositoryに一覧をお願いする部分

-  `@RequestBody Memo memo`
  JSONをMemo型で受け取る部分