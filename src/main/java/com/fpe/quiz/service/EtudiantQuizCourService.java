package com.fpe.quiz.service;

import com.fpe.quiz.model.Etudiant;
import com.fpe.quiz.model.EtudiantQuizCour;

import java.util.List;

public interface EtudiantQuizCourService {
    public int save(EtudiantQuizCour etudiantQuizCour,Long idetudiant,Long Idquiz);
    public List<EtudiantQuizCour> findAll();
    public EtudiantQuizCour findById(long id);
    public EtudiantQuizCour findEtudiantQuizCourByEtudiant(long id);
    public void deleteById(Long id);
}
