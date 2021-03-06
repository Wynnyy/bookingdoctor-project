package sk.wynny.bookingdoctor.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MyPatients {
    @Id
    @GeneratedValue
    private Long id;
    private String name,lname,email;
    private String number;

    @OneToMany
    private List<Prescription> prescriptionList;

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public MyPatients() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MyPatients( String name, String lname, String email, String number) {

        this.name = name;
        this.lname = lname;
        this.email = email;
        this.number = number;
    }
}
