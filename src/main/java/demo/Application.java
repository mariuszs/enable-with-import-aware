package demo;

import demo.config.EnableHelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld(message = "Hello Foo")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
