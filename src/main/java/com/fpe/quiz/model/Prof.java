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
public class Prof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprof;
    private String nom ;
    private String prenom ;
    private String email ;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonBackReference(value = "parcour-prof")
    private Parcour parcour ;

}
