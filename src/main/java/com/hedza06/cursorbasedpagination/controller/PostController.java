package com.hedza06.cursorbasedpagination.controller;

import com.hedza06.cursorbasedpagination.utils.CursorBasedPageable;
import com.hedza06.cursorbasedpagination.entity.Post;
import com.hedza06.cursorbasedpagination.service.PostService;
import com.hedza06.cursorbasedpagination.utils.PageResponse;
import com.hedza06.cursorbasedpagination.utils.PageSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;


    @GetMapping(value = "all")
    public ResponseEntity<List<Post>> all() {
        List<Post> posts = postService.findAll();
        return ok(posts);
    }

    @GetMapping
    public ResponseEntity<PageResponse<List<Post>>> page(CursorBasedPageable cursorBasedPageable) {
        var specification = new PageSpecification<Post>("title", cursorBasedPageable);
        var postPage = postService.findPage(specification, cursorBasedPageable);

        return ok(postPage);
    }
}
