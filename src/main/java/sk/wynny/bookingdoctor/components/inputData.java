package sk.wynny.bookingdoctor.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.wynny.bookingdoctor.service.MyService;


@Component
public class inputData implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    MyService myService;




    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        myService.randomPatients();
        myService.myPatientsList();



    }

}
