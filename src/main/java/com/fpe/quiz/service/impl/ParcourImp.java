package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.ParcourDao;
import com.fpe.quiz.model.Parcour;
import com.fpe.quiz.service.ParcourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcourImp implements ParcourService {
    @Autowired
    ParcourDao parcourDao;
    @Override
    public Parcour save(Parcour parcour) {
        return parcourDao.save(parcour);
    }

    @Override
    public List<Parcour> findAll() {
        return parcourDao.findAll();
    }

    @Override
    public Parcour findById(long id) {
        return parcourDao.findById(id).get();
    }
}
