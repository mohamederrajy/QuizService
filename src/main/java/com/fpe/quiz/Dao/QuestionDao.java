package com.fpe.quiz.Dao;

import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.ResponseQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionDao  extends JpaRepository<Question, Long> {


}
