package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.CouresDao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.service.CouresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouresImp implements CouresService {

    @Autowired
    CouresDao couresDao ;

    @Override
    public Coure save(Coure coure) {
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


}
