package com.fpe.quiz.Dao;

import com.fpe.quiz.model.EtudiantQuizCour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantQuizCourDao extends JpaRepository<EtudiantQuizCour, Long> {
    public List<EtudiantQuizCour> findEtudiantQuizCourByEtudiant_Idetudiant(long idetudiant);

}
