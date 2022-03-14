package sk.wynny.bookingdoctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.wynny.bookingdoctor.model.MyPatients;
import sk.wynny.bookingdoctor.model.Patient;
import sk.wynny.bookingdoctor.repository.BookingPatient;
import sk.wynny.bookingdoctor.repository.PatientsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MyService {
    @Autowired
    BookingPatient myRepository;

    @Autowired
    PatientsRepository patientsRepository;

    public void randomPatients(){
        List<Patient> patientList = new ArrayList<Patient>();
        patientList.add(new Patient("Jozef", "Tmavy", "tmavy@gmail.com", "10:00","09454454"));
        patientList.add(new Patient("Peter", "Zeleny", "zeleny01@gmail.com", "12:00","094545712"));


        myRepository.saveAll(patientList);



    }
    public void myPatientsList(){
        List<MyPatients> myPatientList = new ArrayList<MyPatients>();
        Random random = new Random();

        Integer number = random.nextInt(94555555);
        String number1 = number.toString();
        myPatientList.add(new MyPatients( "Jozef","Tmavy", "tmavy@gmail.com","09454454"));
        myPatientList.add(new MyPatients( "Peter","Zeleny", "zeleny01@gmail.com", number1));
        myPatientList.add(new MyPatients( "Karol","Modry", "Modry01@gmail.com", number1));
        myPatientList.add(new MyPatients( "David","Cierny", "Cierny01@gmail.com", number1));
        myPatientList.add(new MyPatients( "Olga","Dobrosrdecny", "Dobrosrdecny01@gmail.com", number1));
        myPatientList.add(new MyPatients( "Jana","Svetly", "Svetly1@gmail.com", number1));
        myPatientList.add(new MyPatients( "Peter","Spinavy", "Spinavy@gmail.com", number1));
        myPatientList.add(new MyPatients( "Simon","Juzny", "Juzny@gmail.com", number1));
        myPatientList.add(new MyPatients( "Vlado","Cisti", "Cisti@gmail.com", number1));
        myPatientList.add(new MyPatients( "Peter","Zlty", "Zlty@gmail.com", number1));


        patientsRepository.saveAll(myPatientList);

    }
}
