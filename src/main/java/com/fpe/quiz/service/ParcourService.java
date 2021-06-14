package com.fpe.quiz.service;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Parcour;

import java.util.List;

public interface ParcourService {
    public Parcour save(Parcour parcour);
    public List<Parcour> findAll();
    public Parcour findById(long id);
}
