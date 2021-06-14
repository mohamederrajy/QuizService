package com.fpe.quiz.service;

import com.fpe.quiz.model.Coure;

import java.util.List;

public interface CouresService {
    public Coure save(Coure coure);
    public List<Coure> findAll();
    public Coure findById(long id);

}
