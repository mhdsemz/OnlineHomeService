package validation;

import exception.InvalidInformationException;

import java.util.List;
import java.util.regex.Pattern;

public class UserValidation {

    public static String checkEmailValidation(String input) {
        if (input.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))
            return "true";
        else if (input.equals("0"))
            return "false";
        throw new InvalidInformationException("***check your email again!! something is wrong***");
    }

    public static String checkCharacterValidation(String input) {
        if (input.matches("^[a-zA-Z]+$"))
            return "true";
        else if (input.equals("0"))
            return "false";
        throw new InvalidInformationException("***please enter alphabet***");
    }

    public static boolean checkPhoneNumberValidation(String phoneNumber) {
        if (phoneNumber.matches("^(\\+98|0)?9\\d{9}$"))
            return true;
        throw new InvalidInformationException("***your phoneNumber is not true!! please try again***");
    }

    public boolean validateNewName(String name, List<String> list) {
        if (list.contains(name))
            throw new RuntimeException("***duplicate name! please enter another name***");
        return true;
    }

    public boolean validatePassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=.*[A-Z])(?=\\S+$).{8}$";
        if (!Pattern.matches(regex, password))
            throw new RuntimeException("1. A password must have at least eight characters.\n" +
                    "2. A password consists of only letters and digits.");
        return true;
    }

    public boolean checkIfPassIsTrue(String oldPassword, String inputPassword) {
        if (!oldPassword.equals(inputPassword))
            throw new RuntimeException("***password is not true!! please check again***");
        return true;
    }


}

