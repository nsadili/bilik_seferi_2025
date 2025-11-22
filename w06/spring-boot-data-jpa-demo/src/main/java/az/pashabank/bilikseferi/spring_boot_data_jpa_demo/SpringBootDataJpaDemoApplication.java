package az.pashabank.bilikseferi.spring_boot_data_jpa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@Controller
@RestController
public class SpringBootDataJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataJpaDemoApplication.class, args);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String welcome() {
        return "Salam, Gence!";
    }

}