package com.mkpits.shopping.model;

import lombok.*;

import javax.persistence.*;
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
        private int id;
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

}
