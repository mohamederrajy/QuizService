package com.fpe.quiz.Dao;

import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.model.QuizParcour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizParcourDao extends JpaRepository<QuizParcour, Long> {
    public QuizParcour findQuizParcourByIdparcour(Long idparcour);
}
