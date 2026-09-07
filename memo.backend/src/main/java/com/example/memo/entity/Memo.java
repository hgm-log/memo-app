package com.example.memo.entity;

import jakarta.persistence.*;

// メモ１件分のデータを表す設計図
@Entity
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String text;

    // idを外から取得できるようにする
    public Long getId() {
        return id;
    }

    // textを外から取得できるようにする
    public String getText() {
        return text;
    }

    // 受け取ったtextを、このMemoのtextに入れる
    public void setText(String text) {
        this.text = text;
    }
}
