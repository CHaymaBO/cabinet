package com.soft.cabinet.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="rdvs")
public class Rdv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto-increment
    private long id;
    @Column(name = "jour")
    private Date jour;
    @ManyToOne
    @JoinColumn(name="id_patient",referencedColumnName = "id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name="id_doctor",referencedColumnName = "id")
    private Doctor doctor;


}
