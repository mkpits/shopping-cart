package com.mkpits.shopping.model;

import lombok.*;
<<<<<<< HEAD

=======
>>>>>>> 4d38b40dc0711fef47d684e3add112b35873d84f

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "product_new")
public class Product {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "product_id")
    private Long product_id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "modified_at")
    private String modified_at;

    @Column(name = "discount_id")
    private Integer discount_id;



}
