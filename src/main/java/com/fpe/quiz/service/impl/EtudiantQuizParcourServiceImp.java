package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.EtudiantDao;
import com.fpe.quiz.Dao.EtudiantQuizParcourDao;
import com.fpe.quiz.Dao.QuizCourseDao;
import com.fpe.quiz.Dao.QuizParcourDao;
import com.fpe.quiz.model.Etudiant;
import com.fpe.quiz.model.EtudiantQuizParcour;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.model.QuizParcour;
import com.fpe.quiz.service.EtudiantQuizParcourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EtudiantQuizParcourServiceImp  implements EtudiantQuizParcourService {
    @Autowired
    EtudiantQuizParcourDao etudiantQuizParcourDao;

    @Autowired
    EtudiantDao etudiantDao ;

    @Autowired
    QuizParcourDao quizParcourDao ;

    @Override
    public int save(EtudiantQuizParcour etudiantQuizParcour, Long idetudiant, Long Idquiz) {
        Etudiant etudiant = etudiantDao.findById(idetudiant).get();
        QuizParcour quizParcour = quizParcourDao.findById(Idquiz).get();
        if(etudiantQuizParcour!=null && etudiant!=null && quizParcour!=null){

            etudiantQuizParcour.setEtudiant(etudiant);
            etudiantQuizParcour.setQuizParcour(quizParcour);
            etudiantQuizParcour.setDatedepass(new Date());
            etudiantQuizParcourDao.save(etudiantQuizParcour);
            return 1;
        }

        return 0;
    }

    @Override
    public List<EtudiantQuizParcour> findAll() {
        return etudiantQuizParcourDao.findAll();
    }

    @Override
    public EtudiantQuizParcour findById(long id) {
        return etudiantQuizParcourDao.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        etudiantQuizParcourDao.deleteById(id);
    }

    @Override
    public EtudiantQuizParcour findEtudiantQuizCourByEtudiant(long id) {
        return etudiantQuizParcourDao.findEtudiantQuizCourByEtudiant_Idetudiant(id);
    }
}
