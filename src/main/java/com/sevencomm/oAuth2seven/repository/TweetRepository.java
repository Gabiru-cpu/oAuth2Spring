package com.sevencomm.oAuth2seven.repository;

import com.sevencomm.oAuth2seven.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
