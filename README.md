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