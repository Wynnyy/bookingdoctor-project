//package sk.wynny.bookingdoctor.controler;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import sk.wynny.bookingdoctor.model.Patient;
//import sk.wynny.bookingdoctor.repository.MyRepository;
//
//@RestController
//
//public class MyRestControler {
//    @Autowired
//    MyRepository myRepository;
//
//
//    @GetMapping("/")
//    public String home(Model model){
//
//        model.addAttribute("patient",new Patient());
//        return "home";
//    }
//    @GetMapping("/user")
//    public String  homeUser(){
//        //model.addAttribute("patient",new Patient());
//        return "homeUser";
//    }
//    @GetMapping("/admin")
//    public String  homeAdmin(){
//        //model.addAttribute("patient",new Patient());
//        return "homeAdmin";
//    }
//
//}
