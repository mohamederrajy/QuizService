package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.CouresDao;
import com.fpe.quiz.Dao.ParcourDao;
import com.fpe.quiz.Dao.ProfDao;
import com.fpe.quiz.Dao.SectionDao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Parcour;
import com.fpe.quiz.model.Prof;
import com.fpe.quiz.model.Section;
import com.fpe.quiz.service.CouresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouresImp implements CouresService {

    @Autowired
    CouresDao couresDao ;

    @Autowired
    SectionDao sectionDao;
    @Autowired
    ParcourDao parcourDao ;
    @Autowired
    ProfDao profDao ;

    @Override
    public Coure save(Coure coure ,Long parcourid,Long profid) {
       Parcour parcour = parcourDao.findById(parcourid).get() ;
       Prof prof =  profDao.findById(profid).get();
        if (coure == null) return null;
        coure.setParcour(parcour);
        coure.setProf(prof);
        return couresDao.save(coure);
    }

    @Override
    public List<Coure> findAll() {
        return couresDao.findAll();
    }

    @Override
    public Coure findById(long id) {
        return couresDao.findById(id).get();
    }

    @Override
    public Coure update(Coure coure) {
        if (coure == null) return null;
        if (!couresDao.existsById(coure.getIdcour())) return null;
        return couresDao.save(coure);
    }

    @Override
    public void delete(Long id) {
         couresDao.deleteById(id);
    }



    @Override
    public List<Coure> findCoureByParcour_Idparcour(Long id) {
        List<Coure> courses = couresDao.findCoureByParcour_Idparcour(id);
        return courses;
    }

    @Override
    public List<Coure> findCourByProfId(long id) {
        return couresDao.findCoureByProfIdprof(id);
    }

    @Override
    public Long NumberOfCours(long profid) {
        return couresDao.countCoureByProfIdprof(profid);
    }


}
