package sk.wynny.confi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.wynny.bookingdoctor.service.MyService;

@Configuration
public class MyConfig {
    @Autowired
    MyService myService;

    @Bean
    public void sayHello(){
        System.out.println("Hello");
    }

}
