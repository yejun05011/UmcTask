package com.example.board.repository;

import com.example.board.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Post, Long>을 상속하면 CURD 메소드를 사용 가능하다. -> DB에서 다루는 코드를 직접 작성 할 필요가 없음.
public interface PostRepository extends JpaRepository<Post, Long> {
}
