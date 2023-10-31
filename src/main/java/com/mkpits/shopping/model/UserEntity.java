package com.mkpits.shopping.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

    @Table(name="user")
    public class UserEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_id")
        private int userId;
        @Column(name="first_name")
        private String firstName;
        @Column(name="middle_name")
        private String middleName;
        @Column(name="last_name")
        private String lastName;
        @Column(name="mobile_number")
        private String mobileNumber;
        @Column(name="password")
        private String password;
        @Column(name="email")
        private String email;
        @Column(name="created_at")
        private int createdAt;
        @Column(name="created_by")
        private Date createdBy;
        @Column(name="update_at")
        private int updateAt;
        @Column(name = "update_by")
        private Date updateBy;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "userEntity")
    @JoinColumn(name = "address_id")
    private List<Address> addressList;

}
