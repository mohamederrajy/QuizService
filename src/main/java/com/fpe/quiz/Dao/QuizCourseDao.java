package com.fpe.quiz.Dao;
import com.fpe.quiz.model.QuizCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizCourseDao extends JpaRepository<QuizCourse, Long> {
    public QuizCourse findQuizCoursesByCoureIdcour(Long Idcour);
    public List<QuizCourse> findQuizCoursesByCoure_Parcour_Idparcour(Long idparcour);
    public long countQuizCourseByCoure_Prof_Idprof(Long idprof);
    public  List<QuizCourse> findQuizCourseByCoure_Prof_Idprof(Long idprof);
}
