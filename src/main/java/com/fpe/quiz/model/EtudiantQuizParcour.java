package com.fpe.quiz.model;

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

    @OneToOne
    private QuizParcour quizParcour ;
}
