package com.mkpits.shopping.model;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "address" ,catalog = "u316592767_shoppingcart")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id") // Specify the column name in the database
    private long address_id;

    @Column(name = "user_address_id")
    private long user_addressId;
     @ManyToOne (cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
     @JoinColumn(name = "user_address_id",nullable = false,insertable = false,updatable = false)
     @Fetch(FetchMode.SELECT)
     // Define the foreign key column
     private UserEntity userEntity;

     private String address_line_1;

    private String city;

    private String state;

    private String country;

    private char type;

    private String pincode;

    public long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(long address_id) {
        this.address_id = address_id;
    }

    public long getUser_addressId() {
        return user_addressId;
    }

    public void setUser_addressId(long user_addressId) {
        this.user_addressId = user_addressId;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}



