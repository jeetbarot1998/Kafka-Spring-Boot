package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication

// disable any db configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootConsumerApplication.class);
    }
}
