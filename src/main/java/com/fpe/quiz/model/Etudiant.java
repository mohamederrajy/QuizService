package com.fpe.quiz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idetudiant;
    private String nom ;
    private String prenom ;
    private String email ;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonBackReference(value = "parcour-etudaint")
    private Parcour parcour ;
}
