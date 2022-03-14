package sk.wynny.bookingdoctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.wynny.bookingdoctor.model.Patient;

public interface BookingPatient extends JpaRepository<Patient,Long> {

}
