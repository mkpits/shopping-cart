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
    private long roleId;
    @Column(name = "role_name")
    private String roleName;


    @ManyToOne
    @JoinColumn(name = "id")
    private UserEntity userEntity;

}