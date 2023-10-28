package com.mkpits.shopping.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;
    @Column(name = "role_name")
    private String roleName;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}