package com.example.memo.controller;

import com.example.memo.entity.Memo;
import com.example.memo.repository.MemoRepository;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

// Web APIの受付担当（JavaのデータをJSON形式で返す）
@RestController
@RequestMapping("/memos")
public class MemoController {

    private final MemoRepository memoRepository;

    public MemoController(MemoRepository memoRepository) {

        // 受け取ったRepositoryを、Controllerのポケットにしまう
        this.memoRepository = memoRepository;
    }

    // ブラウザから「メモ一覧を見せて！（GETリクエスト）」が来たら動く処理
    @GetMapping
    public List<Memo> getAllMemos() {

        // DBからすべてのメモを取得して返す
        return memoRepository.findAll();
    }

    @PostMapping
    public Memo createMemo(@Valid @RequestBody Memo memo) {
    return memoRepository.save(memo);
    }
}
