package com.fpe.quiz.vo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fpe.quiz.model.Etudiant;
import com.fpe.quiz.model.QuizCourse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.OneToOne;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EtudiantQuizCourVo {
    private Long id;
    private Date datedepass ;
    private double note  ;
    private Etudiant etudiant ;
    private QuizCourse quizCourse ;
}
