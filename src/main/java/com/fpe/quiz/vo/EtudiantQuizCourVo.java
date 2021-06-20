package com.fpe.quiz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EtudiantQuizCourVo {
    private Long id;
    private Date datedepass ;
    private double note  ;
    private Long idetudiant;
    private QuizCourseVo quizCourse ;
}
