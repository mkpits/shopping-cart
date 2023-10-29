package com.mkpits.shopping.model;


import lombok.*;
import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name="product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name ="price")
    private Double price;

//    @Column(name = "discount_id")
//    private Double discount_id;

    @Column(name = "created_at")
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String created_at;

    @Column(name = "modified_at")
   // @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String modified_at;

}
