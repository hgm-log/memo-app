package com.example.memo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


// メモ１件分のデータを表す設計図
@Entity
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "メモを入力してください")

    // Java側で受け取った入力をチェック
    @Size(max = 100, message = "メモは100文字以内で入力してください")

    // DB側の保存欄を100文字に設定
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
