package com.fpe.quiz.service;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.EtudiantCoure;

import java.util.List;

public interface EtudiantCoureService {
    public EtudiantCoure save(EtudiantCoure etudiantCoure , Long idetudaint, Long idcoure);
    public List<EtudiantCoure> findAll();
    public EtudiantCoure findById(long id);
    public EtudiantCoure update(EtudiantCoure etudiantCoure,Long coureid ,Long idetudaint);
    public void delete(Long id) ;
    public List<EtudiantCoure> findByCoure(long CoureId);
    public List<EtudiantCoure> findByEtudaint(long eudaintId);
    public EtudiantCoure findEtudaintCoureByEtudaintAndCour(long idetudaint ,long coureid);
}
