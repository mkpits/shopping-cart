package com.mkpits.shopping.model;


import lombok.*;


import javax.persistence.*;
<<<<<<< HEAD


import java.util.Date;
import java.util.List;




@Entity
=======
import java.sql.Timestamp;
import java.util.List;

>>>>>>> 4d38b40dc0711fef47d684e3add112b35873d84f
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
<<<<<<< HEAD
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
=======
@Entity(name = "user")
public class UserEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "updated_by")
    private Long updatedBy;
>>>>>>> 4d38b40dc0711fef47d684e3add112b35873d84f

}

