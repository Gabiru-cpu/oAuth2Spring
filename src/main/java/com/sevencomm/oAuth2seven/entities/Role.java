package com.sevencomm.oAuth2seven.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;
    private String name;

    public enum Values {
        ADMIN(0L),
        BASIC(1L);


        long roleId;

        Values(long roleId) { this.roleId = roleId; }

    }

}
