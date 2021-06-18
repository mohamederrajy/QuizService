package com.fpe.quiz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EtudiantQuizParcour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datedepass ;
    private double note  ;

    @OneToOne
    private Etudiant etudiant ;

    @OneToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval=true)
    private QuizParcour quizParcour ;
}
