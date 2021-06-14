package com.fpe.quiz.service.impl;
import com.fpe.quiz.Dao.QuizCourseDao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.service.CouresService;
import com.fpe.quiz.service.QuizCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizCourseImp  implements QuizCourseService {

    @Autowired
    QuizCourseDao quizCourseDao ;

    @Autowired
    CouresService couresService;




    @Override
    public List<QuizCourse> findAll() {
        return quizCourseDao.findAll();
    }

    @Override
    public QuizCourse findById(long id) {
        return quizCourseDao.findById(id).get();
    }

    @Override
    public QuizCourse save(QuizCourse quizCourse , Long CoureId) {
        Coure coure = couresService.findById(CoureId);
        if (coure == null) {
            return null;
        } else {
            try {
                quizCourse.setCoure(coure);
                return quizCourseDao.save(quizCourse);
            } catch (Exception e) {
                return null;
            }
        }
    }

    @Override
    public void DeleteQuiz(Long id) {
        quizCourseDao.delete(findById(id));
    }

    @Override
    public QuizCourse findQuizCoursesByCoureIdcour(Long Idcour) {
        return quizCourseDao.findQuizCoursesByCoureIdcour(Idcour);
    }


}
