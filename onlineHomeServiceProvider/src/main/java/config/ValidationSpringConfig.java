package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import validation.UserValidation;

@Configuration
public class ValidationSpringConfig {
    @Bean
    public UserValidation userValidation() {
        return new UserValidation();
    }
}
