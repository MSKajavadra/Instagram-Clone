package com.Instagram.com.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PostLike")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;

    @ManyToOne
    @JoinColumn(name = "fk_like_post_id")
    private Post instagramPost;

    @ManyToOne
    @JoinColumn(name = "fk_like_id")
    private User liker;

}
