package com.fpe.quiz.service;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Section;

import java.util.List;

public interface CouresService {
    public Coure save(Coure coure ,Long parcourid,Long profid);
    public List<Coure> findAll();
    public Coure findById(long id);
    public Coure update(Coure coure);
    public void delete(Long id) ;
    List<Coure> findCoureByParcour_Idparcour(Long id);
    public  List<Coure> findCourByProfId(long id);
    public Long NumberOfCours(long profid);

}
