package sk.wynny.bookingdoctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import sk.wynny.bookingdoctor.model.MyPatients;
import sk.wynny.bookingdoctor.model.Patient;
import sk.wynny.bookingdoctor.model.Prescription;
import sk.wynny.bookingdoctor.repository.BookingPatient;
import sk.wynny.bookingdoctor.repository.PatientsRepository;
import sk.wynny.bookingdoctor.repository.PreScriptionRepo;

import javax.persistence.EntityManager;
import java.util.*;

@Service
public class MyService {
    @Autowired
    BookingPatient myRepository;

    @Autowired
    PatientsRepository patientsRepository;

    @Autowired
    PreScriptionRepo preScriptionRepo;

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
        public void savePrescription(){
            MyPatients myPatients = new MyPatients("Laura","Chora", "laura@gmail.com","09454454");
            Prescription prescription1 = new Prescription();
            Prescription prescription2 = new Prescription();
            Prescription prescription3 = new Prescription();


            //save like list, doesn't work
//            List<Prescription> list = new ArrayList<>();
//            list.add(new Prescription("Paralen"));
//            list.add(new Prescription("Antiobiotika"));
//            list.add(new Prescription("Lexaurin"));
//          myPatients.setPrescriptionList(list);
//            preScriptionRepo.saveAll(list);

            prescription1.setPrescriptionl("Paralen");
            prescription1.setMyPatients(myPatients);
            prescription2.setPrescriptionl("Antiobitoka");
            prescription2.setMyPatients(myPatients);
            prescription3.setPrescriptionl("Lexaurin");
            prescription3.setMyPatients(myPatients);


            patientsRepository.save(myPatients);

            preScriptionRepo.save(prescription1);
            preScriptionRepo.save(prescription2);
            preScriptionRepo.save(prescription3);


        }

}
