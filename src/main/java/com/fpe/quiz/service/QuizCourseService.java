package com.fpe.quiz.service;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.QuizCourse;

import java.util.List;

public interface QuizCourseService {
   // public QuizCourse save(QuizCourse quizCourse );
    public List<QuizCourse> findAll();
    public QuizCourse findById(long id);
    public QuizCourse save(QuizCourse quizCourse , Long CoureId);
    public void DeleteQuiz(Long id);
    public QuizCourse findQuizCoursesByCoureIdcour(Long Idcour);
}
