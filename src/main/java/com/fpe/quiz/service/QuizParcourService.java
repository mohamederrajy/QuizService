package com.fpe.quiz.service;

import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.model.QuizParcour;

import java.util.List;

public interface QuizParcourService   {
        public QuizParcour findById(long id);
        public QuizParcour save(QuizParcour quizParcour , Long parcourid);
        public void DeleteQuiz(Long id);
        public List<QuizParcour> findAll();
        public QuizParcour findQuizParcourByParcour(Long idparcour);

}
