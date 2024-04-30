package com.Instagram.com.Repositroy;

import com.Instagram.com.Model.Comment;
import com.Instagram.com.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Integer> {
    Collection<Comment> findByInstagramPost(Post validPost);

}
