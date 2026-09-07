# 一言メモアプリ 学習メモ

## ControllerからDBまでのつながり

### 分からなかったこと

- データの流れやつながり
- データをどのように受け取り、どのような流れでDBへ送るのか
- DBから取得した結果が、どのように返ってくるのか

### 現在の理解

Spring BootのWebアプリでは、Controllerは基本的に外部から来たリクエストを最初に受け付けて、
お願いに合った処理へつなぐ窓口

【リクエストの流れ】

```text
Postman
「一覧を見せて/メモを保存して」
↓
MemoController（受付窓口）
「Repositoryさん、お願いします！」
↓
MemoRepository（DB操作担当）
「はーい！ってことで、MySQLさんこれお願いします！」
↓
MySQL（データの保管庫）
```
```text
リクエスト：Postman → Controller → Repository → MySQL  
     結果 ：Postman ← Controller ← Repository ← MySQL
```
このように、リクエストを送る流れと、結果が返る流れの往復になる。

※Serviceは、必ず必要なものではなく、Controllerへ書くには仕事の判断が複雑になってきたときに、役割を分けるために使う

### コードの意味

- `@GetMapping`
  GETが来たら、この処理を動かす目印

-  `memoRepository.findAll()`
   Repositoryに一覧をお願いする部分

-  `@RequestBody Memo memo`
   JSONをMemo型で受け取る部分