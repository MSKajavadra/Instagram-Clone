package com.Instagram.com.Repositroy;

import com.Instagram.com.Model.Like;
import com.Instagram.com.Model.Post;
import com.Instagram.com.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface LikeRepo extends JpaRepository<Like,Integer> {
    List<Like> findByInstagramPostAndLiker(Post twitterPost, User liker);
    Collection<Like> findByInstagramPost(Post validPost);
}
