//package com.mkpits.shopping.model;
//
//
//
//import lombok.*;
//
//import javax.persistence.*;
//
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Entity(name = "cart")
//public class Cart {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long user_id;
//
//    @ManyToOne
//    private  Product product;
//
//    private String name;
//
//    private Double price;
//
//    private int quantity;
//
//    private String created_at;
//
//    private  int total;
//    private  String modified_at;
//}
