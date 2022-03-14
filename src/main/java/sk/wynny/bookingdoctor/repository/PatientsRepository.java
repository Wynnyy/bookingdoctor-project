package sk.wynny.bookingdoctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.wynny.bookingdoctor.model.MyPatients;

public interface PatientsRepository extends JpaRepository<MyPatients,Long> {
}
