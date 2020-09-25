package SpringPercipio.entity;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class MainStart {

    public static void main(String[] args) {
        SpringApplication.run(MainStart.class, args);

        //  ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");

        // }
    }
}
    
