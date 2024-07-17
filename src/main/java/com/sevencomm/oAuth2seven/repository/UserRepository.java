package com.sevencomm.oAuth2seven.repository;

import com.sevencomm.oAuth2seven.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
