package models.builder;

import models.enums.UserRole;
import models.enums.UserStatus;
import models.member.User;

import java.util.Date;

public class UserBuilder {
    private String firstname;
    private String lastname;
    private String password;
    private String phoneNumber;
    private String emailAddress;
    private UserRole userRole;
    private Date registerDate;
    private Long credit;
    private UserStatus userStatus;


    public UserBuilder() {

    }

    public User build() {
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmailAddress(emailAddress);
        user.setPassword(password);
        user.setUserRole(userRole);
        user.setRegisterDate(registerDate);
        user.setCredit(credit);
        user.setUserStatus(userStatus);
        return user;
    }

    public UserBuilder withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public UserBuilder withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public UserBuilder withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public UserBuilder withUserRole(UserRole userRole) {
        this.userRole = userRole;
        return this;
    }

    public UserBuilder withRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
        return this;
    }

    public UserBuilder withCredit(Long credit) {
        this.credit = credit;
        return this;
    }
}
