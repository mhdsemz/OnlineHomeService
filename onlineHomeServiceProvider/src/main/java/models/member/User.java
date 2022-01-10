package models.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import models.enums.UserRole;
import models.enums.UserStatus;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Inheritance
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
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
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

}
