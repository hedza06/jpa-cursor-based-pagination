package com.hedza06.cursorbasedpagination.repository;

import com.hedza06.cursorbasedpagination.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>, JpaSpecificationExecutor<Post> {
    boolean existsByTitleLessThan(String title);
}
