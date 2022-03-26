package sk.wynny.bookingdoctor.model;

import javax.persistence.*;

@Entity
public class Prescription {
    @Id
    @GeneratedValue
    private Long id;

        private String prescriptionl;

  // @JoinColumn(foreignKey = @ForeignKey(name = "fk_prescription"))
    @ManyToOne
    private MyPatients myPatients;

    public MyPatients getMyPatients() {
        return myPatients;
    }

    public void setMyPatients(MyPatients myPatients) {
        this.myPatients = myPatients;
    }

    public Prescription(String prescriptionl) {
        this.prescriptionl = prescriptionl;

    }

    public Prescription() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrescriptionl() {
        return prescriptionl;
    }

    public void setPrescriptionl(String prescriptionl) {
        this.prescriptionl = prescriptionl;
    }
}
