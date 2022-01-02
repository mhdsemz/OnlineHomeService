package models;

import lombok.Data;
import models.enums.UserStatus;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String emailAddress;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    
}
