package com.mkpits.shopping.model;

import lombok.*;

import javax.persistence.*;
<<<<<<< HEAD
@Entity
=======


>>>>>>> 4d38b40dc0711fef47d684e3add112b35873d84f
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
<<<<<<< HEAD
@Table(name = "address" ,catalog = "u316592767_shoppingcart")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id") // Specify the column name in the database
    private int address_id;
     @OneToOne(cascade = CascadeType.ALL)
     // Define the foreign key column
     @JoinColumn(name = "user_id",referencedColumnName = "user_id")
     private UserEntity userEntity;

    public Address(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
=======
@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;

    @ManyToOne
    @JoinColumn(name = "id")
    private UserEntity userEntity;

    @Column(name = "type")
    private char type;

    @Column(name = "address_line_1")
    private String line1;

    @Column(name = "address_line_2")
    private String line2;

    @Column(name = "address_line_3")
    private String line3;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pincode")
    private String pincode;


}
>>>>>>> 4d38b40dc0711fef47d684e3add112b35873d84f

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    private String address_line_1;

    private String address_line_2;

    private String address_line_3;

    private String city;

    private String state;

    private String country;

    private char type;

    private String pincode;



}



