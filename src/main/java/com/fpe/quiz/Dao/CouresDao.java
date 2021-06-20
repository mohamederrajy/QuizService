package com.fpe.quiz.Dao;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouresDao extends JpaRepository<Coure, Long> {
    List<Coure> findCoureByIdparcour(Long id);
    public List<Coure> findCoureByIdprof(Long idprof) ;
    public Long countCoureByIdprof(Long idprof);
}
