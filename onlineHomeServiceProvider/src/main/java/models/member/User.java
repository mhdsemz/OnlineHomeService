package models.member;

import lombok.Data;
import models.enums.UserRole;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Inheritance
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String emailAddress;
    @Column(nullable = false)
    private String password;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;
    private Long credit;

}
