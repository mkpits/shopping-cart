package com.mkpits.shopping.model;

import lombok.*;

import javax.persistence.*;
    @Entity
    @Getter
    @Setter
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class Address {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "address_id")
        private int addressId;
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
        @Column(name = "type")
        private char type;

        @Column(name="pincode")
        private String pincode;

        @ManyToOne
        @JoinColumn(name = "id")
        private UserEntity userEntity;
    }


