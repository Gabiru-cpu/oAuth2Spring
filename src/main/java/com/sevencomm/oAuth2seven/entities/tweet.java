package com.sevencomm.oAuth2seven.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Data
@Entity
@Table(name = "tb_tweets")
public class tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;

    private User user;
    private String content;

    @CreationTimestamp
    private Instant creationTimestamp;
}
