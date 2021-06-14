package com.fpe.quiz.Dao;

import com.fpe.quiz.model.ResponseQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponseQuestionDao extends JpaRepository<ResponseQuestion, Long> {
    public List<ResponseQuestion> findResponseQuestionByQuestionIdquestion(Long Idquestion);
}
