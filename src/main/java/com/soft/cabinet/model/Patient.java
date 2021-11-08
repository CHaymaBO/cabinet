package com.soft.cabinet.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto-increment
    private long id;
    @Column(name = "nom")
    private String firstname;
    @Column(name = "prenom")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "tel")
    private String phone;








}
