package com.example.memo.repository;

import com.example.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

// MemoのDB操作を担当。保存・取得などの基本処理はSpringが自動で用意する
// <Memo, Long>は「扱うデータはMemo, 主キーの型はLong」という意味
public interface MemoRepository extends JpaRepository<Memo, Long> {
}
