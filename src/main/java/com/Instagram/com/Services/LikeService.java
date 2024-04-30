package com.Instagram.com.Services;

import com.Instagram.com.Repositroy.LikeRepo;
import com.Instagram.com.Model.Like;
import com.Instagram.com.Model.Post;
import com.Instagram.com.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {
    @Autowired
    LikeRepo likeRepo;
    public boolean isLikeAllowedOnThisPost(Post twitterPost, User liker) {
        List<Like> likeList = likeRepo.findByInstagramPostAndLiker(twitterPost,liker);
        return likeList != null && likeList.isEmpty();
    }

    public String addLike(Like like) {
        likeRepo.save(like);
        return "Instagram post liked successfully!!!";
    }
    public Integer getLikeCountForPost(Post validPost) {
        return likeRepo.findByInstagramPost(validPost).size();
    }

    public Like findLike(Integer likeId) {
        return likeRepo.findById(likeId).orElse(null);
    }

    public void removeLike(Like like) {
        likeRepo.delete(like);
    }


}
