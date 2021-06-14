package com.fpe.quiz.Dao;
import com.fpe.quiz.model.QuizCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizCourseDao extends JpaRepository<QuizCourse, Long> {
    public QuizCourse findQuizCoursesByCoureIdcour(Long Idcour);
}
