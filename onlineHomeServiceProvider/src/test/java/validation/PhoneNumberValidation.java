package validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PhoneNumberValidation {
    UserValidation validation;

    @BeforeEach
    void init() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserValidation.class);
        this.validation = (UserValidation) context.getBean("userValidation");
    }

    @ParameterizedTest
    @CsvSource({"09127297301", "09317297301"})
    void givePhoneNumber_checkValidationNumbers(String phoneNumber) {
        boolean b = validation.checkPhoneNumberValidation(phoneNumber);
        Assertions.assertTrue(b);
    }
}
