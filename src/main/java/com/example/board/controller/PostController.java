package com.example.board.controller;

import com.example.board.entity.Post;
import com.example.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // HTTP 요청을 JSON 응답으로 처리.
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    // 게시글 작성
    @PostMapping
    public Post create(@RequestBody Post post) {
        return postService.create(post);
    }

    // 게시글 조회
    @GetMapping
    public List<Post> getAll() {
        return postService.findAll();
    }

    // 게시글 수정
    @PutMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        return postService.update(id, post);
    }

    // 게시글 삭제
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        postService.delete(id);
    }
}