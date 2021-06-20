package com.fpe.quiz.Dao;

import com.fpe.quiz.model.Parcour;
import com.fpe.quiz.model.Prof;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfDao  extends JpaRepository<Prof, Long> {
}
