package com.gulukal.blogonetomanyapp;

import com.gulukal.blogonetomanyapp.entity.Comment;
import com.gulukal.blogonetomanyapp.entity.Post;
import com.gulukal.blogonetomanyapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BlogOneToManyAppApplication implements CommandLineRunner {


    @Autowired
    private PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogOneToManyAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Post post1 = Post.builder().title("Ilk yazi").decription("Blogu duyurma yazisi").build();

        List<Comment> postComments = post1.getComments();

        Comment comment1 = Comment.builder().text("Ilk yorum").build();
        Comment comment2 = Comment.builder().text("Ilk yorum").build();
        Comment comment3 = Comment.builder().text("Ilk yorum").build();

        postComments.add(comment1);
        postComments.add(comment2);
        postComments.add(comment3);

        postRepository.save(post1);

    }
}
