package jackynote.pro;

import jackynote.pro.config.NamingConventionValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String... args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
        NamingConventionValidator validator = context.getBean(NamingConventionValidator.class);
        String basePackage = "jackynote.pro"; // Specify your base package here
        validator.validateNamingConventions(basePackage);
    }
}
