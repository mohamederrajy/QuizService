package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.EtudiantDao;
import com.fpe.quiz.Dao.EtudiantQuizCourDao;
import com.fpe.quiz.Dao.QuizCourseDao;
import com.fpe.quiz.model.Etudiant;
import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.service.EtudiantQuizCourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EtudiantQuizCourServiceImp implements EtudiantQuizCourService {
    @Autowired
    EtudiantQuizCourDao etudiantQuizCourDao ;

    @Autowired
    EtudiantDao etudiantDao ;

    @Autowired
    QuizCourseDao quizCourseDao ;


    @Override
    public int  save(EtudiantQuizCour etudiantQuizCour, Long idetudiant, Long Idquiz) {
        Etudiant etudiant = etudiantDao.findById(idetudiant).get();
        QuizCourse quizCourse = quizCourseDao.findById(Idquiz).get();
        if(etudiantQuizCour!=null && etudiant!=null && quizCourse!=null){
            etudiantQuizCour.setEtudiant(etudiant);
            etudiantQuizCour.setQuizCourse(quizCourse);
            etudiantQuizCour.setDatedepass(new Date());
            etudiantQuizCourDao.save(etudiantQuizCour);
            return 1;
        }
        else {
            return 0;
        }



    }

    @Override
    public List<EtudiantQuizCour> findAll() {
        return etudiantQuizCourDao.findAll() ;
    }

    @Override
    public EtudiantQuizCour findById(long id) {
        return etudiantQuizCourDao.findById(id).get();
    }

    @Override
    public List<EtudiantQuizCour> findEtudiantQuizCourByEtudiant(long id) {
        return etudiantQuizCourDao.findEtudiantQuizCourByEtudiant_Idetudiant(id);
    }

    @Override
    public void  deleteById(Long id) {
         etudiantQuizCourDao.deleteById(id);
    }


}
