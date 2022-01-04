package validation;

import exception.InvalidInformationException;

public class UserValidation {

    public static String checkEmailValidation(String input) {
        if (input.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))
            return "true";
        else if (input.equals("0"))
            return "false";
        throw new InvalidInformationException("***check your email again!! something is wrong***");
    }
}
