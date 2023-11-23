package com.mkpits.shopping.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long role_id;

    private String role_name;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}