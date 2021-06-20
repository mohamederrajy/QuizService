package com.fpe.quiz.Dao;

import com.fpe.quiz.model.EtudiantCoure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantCoureDao extends JpaRepository<EtudiantCoure, Long> {
    public List<EtudiantCoure> findEtudiantCoureByCoureIdcour(Long idcour) ;
    public List<EtudiantCoure> findEtudiantCoureByEtudiant_Idetudiant(Long idetudiant);
    public EtudiantCoure findEtudiantCoureByEtudiant_IdetudiantAndCoure_Idcour(Long idetudiant,Long idcour);
}
