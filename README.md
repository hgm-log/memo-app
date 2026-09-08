# 一言メモアプリ

## 概要

短い文章を登録し、一覧で確認できるWebアプリです。

## 作成目的

Spring BootからDBまでのデータの流れについて理解を深めるため、機能を絞った一言メモアプリを作成しました。

## 現在実装している機能

- メモ一覧の取得
- メモの新規登録

## 使用技術

- 言語：Java
- フレームワーク：Spring Boot
- データベース：MySQL
- DB操作：Spring Data JPA
- コンテナ環境：Docker
- API動作確認：Postman

## プロジェクト構成

```text
memo-app
├── README.md
└── memo.backend
    ├── docs
    │   └── learning-notes.md
    └── src/main/java/com/example/memo
        ├── controller   リクエストを受け付ける
        │   └── MemoController.java
        ├── entity　　　　メモのデータを表し、DBのテーブルと対応する
        │   └── Memo.java
        └── repository　　DBへの保存や取得を行う
            └── MemoRepository.java
```

## API一覧

| HTTPメソッド | URL | 処理内容 |
|---|---|---|
| GET | `/memos` | DBからすべてのメモを取得して返す |
| POST | `/memos` | 送信されたメモをDBへ保存し、保存結果を返す |

## 学習記録

制作中に理解した内容や、つまづいた点を以下に記録してます。

- [学習記録](memo.backend/docs/learning-notes.md)