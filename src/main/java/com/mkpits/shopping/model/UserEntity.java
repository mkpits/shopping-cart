package com.mkpits.shopping.model;


import lombok.*;


import javax.persistence.*;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;




@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") // Specify the column name in the database
    private int user_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "address_id",referencedColumnName = "address_id")
    private Address address;

    private String first_name;

    private String middle_name;

    private String last_name;

    private String mobile_number;

    private String password;

    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    private int created_by;

    @Temporal(TemporalType.TIMESTAMP)
    private Date update_at;

    private int update_by;


}

