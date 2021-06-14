package com.fpe.quiz.service;

import com.fpe.quiz.model.ResponseQuestion;
import lombok.extern.java.Log;

import java.util.List;

public interface ResponseQuestionService {
    public ResponseQuestion save(ResponseQuestion responseQuestion,Long QuestionId);
    public List<ResponseQuestion> findAll();
    public ResponseQuestion findResponseById(long id);
    public List<ResponseQuestion> findResponseQuestionByQuestion(Long Idquestion);


}
