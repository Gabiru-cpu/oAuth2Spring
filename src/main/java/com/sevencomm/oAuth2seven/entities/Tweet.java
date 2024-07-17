package com.sevencomm.oAuth2seven.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Data
@Entity
@Table(name = "tb_tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;

    @CreationTimestamp
    private Instant creationTimestamp;
}
