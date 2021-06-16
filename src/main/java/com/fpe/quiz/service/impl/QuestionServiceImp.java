package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.QuestionDao;
import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.ResponseQuestion;
import com.fpe.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService {

    @Autowired
    QuestionDao questionDao ;

    @Override
    public Question save(Question question) {

        return questionDao.save(question);

    }

    @Override
    public List<Question> findAll() {
      return   questionDao.findAll();
    }


    @Override
    public Question findById(long id) {
        return questionDao.findById(id).get();
    }

    @Override
    public List<ResponseQuestion> GetallRespons(long id) {
        return questionDao.findById(id).get().getResponses();
    }

    @Override
    public void DeleteById(Long id) {
        questionDao.deleteById(id);
    }


}
