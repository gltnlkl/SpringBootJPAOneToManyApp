package com.gulukal.blogonetomanyapp.repository;

import com.gulukal.blogonetomanyapp.entity.Comment;
import com.gulukal.blogonetomanyapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
