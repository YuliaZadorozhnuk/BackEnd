package bsuir;

import bsuir.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EntityScan( basePackages = {"bsuir.model"} )
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[] {Main.class, JpaConfig.class}, args);
    }
}
