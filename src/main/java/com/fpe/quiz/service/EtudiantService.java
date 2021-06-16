package com.fpe.quiz.service;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Etudiant;

import java.util.List;

public interface EtudiantService {
    public Etudiant save(Etudiant etudiant);
    public List<Etudiant> findAll();
    public Etudiant findById(long id);
    public void deleteById(Long id);
}
