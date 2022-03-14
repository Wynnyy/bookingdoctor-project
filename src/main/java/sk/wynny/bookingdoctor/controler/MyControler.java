package sk.wynny.bookingdoctor.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sk.wynny.bookingdoctor.model.MyPatients;
import sk.wynny.bookingdoctor.model.Patient;
import sk.wynny.bookingdoctor.repository.BookingPatient;
import sk.wynny.bookingdoctor.repository.PatientsRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class MyControler {

    @Autowired
    BookingPatient myRepository;

    @Autowired
    PatientsRepository  patientsRepository;

    Logger logger = LoggerFactory.getLogger(Patient.class);



    @GetMapping(value = {"/user","/"})
    public String  homeUser(){
        //model.addAttribute("patient",new Patient());
        return "user";
    }
    @GetMapping("/admin")
    public String  homeAdmin(Model model){
        List<Patient> patientList = myRepository.findAll();
        model.addAttribute("patientList",patientList);
        return "admin";
    }
    @GetMapping("/booking")
    public String bookingService(Model model){
        model.addAttribute("patient", new Patient());
        return "booking";
    }
    @GetMapping("/mypatients")
    public String prescriptions(Model model){
        List<MyPatients> myPatientsList = patientsRepository.findAll();
        model.addAttribute("myPatientsList", myPatientsList);
        return "mypatients";
    }
    @RequestMapping(value = "/prescriptionsSave",method = RequestMethod.POST)
    public String savePrescript(@ModelAttribute("mypaptients")MyPatients myPatients){
        patientsRepository.save(myPatients);
        return "redirect:/admin/mypatients";
    }





    @RequestMapping("/admin/delete/{id}")
        public String deletePatient(@PathVariable long id){
            myRepository.deleteById(id);
            return "redirect:/admin";
        }


    @RequestMapping("/admin/edit/{id}")
    public ModelAndView editPatient(@PathVariable long id) {
        ModelAndView viewPatient = new ModelAndView("booking");
        Optional<Patient> patient = myRepository.findById(id);
        viewPatient.addObject("patient",patient);
        return viewPatient;
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveEditedPatient(@ModelAttribute("patient") Patient patient){
        try {
            myRepository.save(patient);
        }catch (Exception ex){
            logger.info("Duplicated booked time");
            return "redirect:/booking";



        }
        return "redirect:/admin/";

    }









}
