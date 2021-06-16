package com.fpe.quiz.vo;

import com.fpe.quiz.model.Etudiant;
import com.fpe.quiz.model.QuizParcour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EtudiantQuizParcourVo {
    private Long id;
    private Date datedepass ;
    private double note  ;
    private Etudiant etudiant ;
    private QuizParcour quizParcour ;
}
