package com.fpe.quiz.service;

import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.ResponseQuestion;

import java.util.List;

public interface QuestionService {
    public Question save(Question question);
    public List<Question> findAll();
    public Question findById(long id);
    public List<ResponseQuestion> GetallRespons(long id);
}
