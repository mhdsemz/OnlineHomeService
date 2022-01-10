package dto;

import lombok.Data;
import models.enums.UserRole;
@Data
public class UserDto {
    private String firstname;
    private String lastname;
    private String emailAddress;
    private UserRole userStatus;
    private Long credit;

}
