package com.fpe.quiz.Dao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Parcour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcourDao  extends JpaRepository<Parcour, Long> {
    Parcour findParcourByCoures(Coure coure);

}
