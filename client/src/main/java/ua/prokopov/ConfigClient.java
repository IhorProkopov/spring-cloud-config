package ua.prokopov;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient {

    @Value("${property}")
    private String prop;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }

    @GetMapping("/prop")
    public String getProp() {
        return String.format("Prop: %s...\n", prop);
    }
}