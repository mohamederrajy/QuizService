package com.fpe.quiz.Dao;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {

     public List<Etudiant> findEtudiantByParcourIdparcour(Long idparcour);
     public long countEtudiantByParcourIdparcour(Long idparcour);

}
