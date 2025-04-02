package com.example.board.service;

import com.example.board.entity.Post;
import com.example.board.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    // 게시글 생성
    public Post create(Post post) {
        return postRepository.save(post);
    }

    // 전체 글 조회
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    // 특정 게시글 수정
    public Post update(Long id, Post updatedPost) {
        Post post = postRepository.findById(id).orElseThrow(null);
        post.setTitle(updatedPost.getTitle());
        post.setContent(updatedPost.getContent());
        return postRepository.save(post);
    }

    // 특정 게시글 삭제
    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
