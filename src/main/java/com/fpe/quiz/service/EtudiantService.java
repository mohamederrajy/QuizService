package com.fpe.quiz.service;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Etudiant;

import java.util.List;

public interface EtudiantService {
    public Etudiant save(Etudiant etudiant);
    public List<Etudiant> findAll();
    public List<Etudiant> findByparcour(long parcoureid);
    public long NumberEtudaintParcour(long parcoureid);
    public Etudiant findById(long id);
    public void deleteById(Long id);

}
