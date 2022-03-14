package sk.wynny.bookingdoctor.model;

import javax.persistence.*;

@Entity
public class Prescription {
    @Id
    @GeneratedValue
    private Long id;

//    @ManyToOne
//    @JoinColumn(foreignKey = @ForeignKey(name = "fk_prescriptionl_myPatients_id")) //dorobit
    private String prescriptionl;

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
