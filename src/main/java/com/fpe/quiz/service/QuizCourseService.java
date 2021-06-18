package com.fpe.quiz.service;

import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.vo.QuizCourseVo;

import java.util.List;

public interface QuizCourseService {
   // public QuizCourse save(QuizCourse quizCourse );
    public List<QuizCourse> findAll();
    public List<QuizCourse> findQuizcourByParcour(long id);
    public QuizCourse findById(long id);
    public QuizCourse save(QuizCourse quizCourse, Long CoureId);
    public void DeleteQuiz(Long id);
    public QuizCourse findQuizCoursesByCoureIdcour(Long Idcour);
    public long NumberOfQuizCoure(Long idprof);
    public List<QuizCourse> findQuizcourByProf(long id);

}
