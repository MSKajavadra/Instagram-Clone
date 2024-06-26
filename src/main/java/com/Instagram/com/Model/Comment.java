package com.Instagram.com.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(nullable = false)
    private String commentBody;

    @ManyToOne
    @JoinColumn(name = "fk_comment_post_id")
    private Post instagramPost;

    @ManyToOne
    @JoinColumn(name = "fk_commenter_id")
    private User commenter;

    public String time;

    @PrePersist
    private void prePersist() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Define your desired date/time format
        this.time = sdf.format(new Date(System.currentTimeMillis()));
    }

}
