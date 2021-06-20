package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.QuizParcourDao;
import com.fpe.quiz.model.QuizParcour;
import com.fpe.quiz.service.QuizParcourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizParcourImp  implements QuizParcourService {
    @Autowired
    QuizParcourDao quizParcourDao;


    @Override
    public QuizParcour findById(long id) {
        return quizParcourDao.findById(id).get();
    }

    @Override
    public QuizParcour save(QuizParcour quizParcour, Long parcourid) {

        if (parcourid == null) {
            return null;
        } else {
            try {
                quizParcour.setIdparcour(parcourid);
                return quizParcourDao.save(quizParcour);
            } catch (Exception e) {
                return null;
            }
        }
    }

    @Override
    public void DeleteQuiz(Long id) {
        QuizParcour quizParcour = quizParcourDao.findById(id).get();
        quizParcourDao.delete(quizParcour);

    }

    @Override
    public List<QuizParcour> findAll() {
        return quizParcourDao.findAll();
    }

    @Override
    public QuizParcour findQuizParcourByParcour(Long idparcour) {
        return quizParcourDao.findQuizParcourByIdparcour(idparcour);
    }
}
