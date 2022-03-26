package sk.wynny.bookingdoctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.wynny.bookingdoctor.model.Prescription;

public interface PreScriptionRepo extends JpaRepository<Prescription,Long> {

}
