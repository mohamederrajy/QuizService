package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.EtudiantDao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Etudiant;
import com.fpe.quiz.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImp implements EtudiantService {
    @Autowired
    EtudiantDao etudiantDao;
    @Override
    public Etudiant save(Etudiant etudiant) {
        return etudiantDao.save(etudiant);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantDao.findAll() ;
    }

    @Override
    public Etudiant findById(long id) {
        return etudiantDao.findById(id).get() ;
    }

    @Override
    public void deleteById(Long id) {
        etudiantDao.deleteById(id);
    }
}
