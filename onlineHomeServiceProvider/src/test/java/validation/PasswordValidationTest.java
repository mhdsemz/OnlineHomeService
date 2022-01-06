package validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PasswordValidationTest {
    UserValidation validation;

    @BeforeEach
    void init() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserValidation.class);
        this.validation = (UserValidation) context.getBean("userValidation");
    }

    @ParameterizedTest
    @CsvSource({"557872m50,557872m50","123m,123"})
    void givenPassword_checkIfPassIsValidOrNot(String inputPass, String oldPass) {
        boolean b = validation.checkIfPassIsTrue(oldPass, inputPass);
        Assertions.assertTrue(b);
    }
}
