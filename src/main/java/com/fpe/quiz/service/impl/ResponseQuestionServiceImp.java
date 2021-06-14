package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.ResponseQuestionDao;
import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.ResponseQuestion;
import com.fpe.quiz.service.QuestionService;
import com.fpe.quiz.service.ResponseQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseQuestionServiceImp implements ResponseQuestionService {
    @Autowired
    ResponseQuestionDao responseQuestionDao ;
    @Autowired
    QuestionService questionService ;
    @Override
    public ResponseQuestion save(ResponseQuestion responseQuestion ,Long QuestionId) {
        Question question = questionService.findById(QuestionId);
        if (question == null) {
            return null;
        } else {
            try {
                responseQuestion.setQuestion(question);
                return responseQuestionDao.save(responseQuestion);
            } catch (Exception e) {
                return null;
            }
        }
    }

    @Override
    public List<ResponseQuestion> findAll() {
        return  responseQuestionDao.findAll();
    }

    @Override
    public ResponseQuestion findResponseById(long id) {
        return responseQuestionDao.findById(id).get();
    }

    @Override
    public List<ResponseQuestion> findResponseQuestionByQuestion(Long Idquestion) {
        return responseQuestionDao.findResponseQuestionByQuestionIdquestion(Idquestion);
    }
}
