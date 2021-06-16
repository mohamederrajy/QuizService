package com.fpe.quiz.service;

import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.model.EtudiantQuizParcour;

import java.util.List;

public interface EtudiantQuizParcourService {
    public int save(EtudiantQuizParcour etudiantQuizParcour, Long idetudiant, Long Idquiz);
    public List<EtudiantQuizParcour> findAll();
    public EtudiantQuizParcour findById(long id);
    public void deleteById(Long id);
    public EtudiantQuizParcour findEtudiantQuizCourByEtudiant(long id);
}
