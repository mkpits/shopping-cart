package com.mkpits.shopping.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "address" ,catalog = "u316592767_shoppingcart")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id") // Specify the column name in the database
    private int address_id;
     @OneToOne(cascade = CascadeType.ALL ,mappedBy = "address")
     // Define the foreign key column
     private UserEntity userEntity;

    public Address(UserEntity userEntity) {
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



