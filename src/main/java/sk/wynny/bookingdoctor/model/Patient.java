package sk.wynny.bookingdoctor.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String name,lname,email;
    @Column(unique = true)
    private String booking;
    private String number;

    public Patient(String name, String lname, String email, String booking, String number) {

        this.name = name;
        this.lname = lname;
        this.email = email;
        this.booking = booking;
        this.number = number;
    }

    public Patient() {
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

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public String getNumber() {
        return number;
    }

    public Long getId() {
        return id;
    }



    public void setNumber(String number) {
        this.number = number;
    }
}
