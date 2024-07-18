package com.sevencomm.oAuth2seven.repository;

import com.sevencomm.oAuth2seven.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
