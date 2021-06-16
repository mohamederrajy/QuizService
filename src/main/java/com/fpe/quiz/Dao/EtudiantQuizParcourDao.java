package com.fpe.quiz.Dao;

import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.model.EtudiantQuizParcour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantQuizParcourDao extends JpaRepository<EtudiantQuizParcour, Long> {
    public EtudiantQuizParcour findEtudiantQuizCourByEtudiant_Idetudiant(long idetudiant );

}
