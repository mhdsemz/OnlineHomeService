package validation;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmailValidation {
    UserValidation validation;

    @BeforeEach
    void init() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserValidation.class);
        this.validation = (UserValidation) context.getBean("userValidation");
    }

    @ParameterizedTest
    @CsvSource({"mohadese1452@gmail.com","mohanaMz5822@gmail.com"})
    void giveEmail_checkValidation(String emailAddress) {
        boolean result = this.validation.checkEmailValidation(emailAddress);
        Assertions.assertTrue(result);
    }
}
