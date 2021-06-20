package com.fpe.quiz.service.impl;
import com.fpe.quiz.Dao.QuizCourseDao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.service.CouresService;
import com.fpe.quiz.service.QuizCourseService;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.fpe.quiz.vo.QuizCourseVo;

import java.util.List;

@Service
public class QuizCourseImp  implements QuizCourseService {

    @Autowired
    QuizCourseDao quizCourseDao ;

    @Autowired
    CouresService couresService;




    @Override
    public List<QuizCourse> findAll() {
        return  quizCourseDao.findAll();
    }

    @Override
    public List<QuizCourse> findQuizcourByParcour(long id) {
        return quizCourseDao.findQuizCoursesByCoure_Idparcour(id);
    }

    @Override
    public QuizCourse findById(long id) {
        return quizCourseDao.findById(id).get();
    }

    @Override
    public QuizCourse save(QuizCourse quizCourse , Long CoureId) {
        // quizCourseVo  =
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
        quizCourseDao.deleteById(id);
    }

    @Override
    public QuizCourse findQuizCoursesByCoureIdcour(Long Idcour) {
        return quizCourseDao.findQuizCoursesByCoureIdcour(Idcour);
    }

    @Override
    public long NumberOfQuizCoure(Long idprof) {
        return quizCourseDao.countQuizCourseByCoure_Idprof(idprof);
    }

    @Override
    public List<QuizCourse> findQuizcourByProf(long id) {
        return quizCourseDao.findQuizCourseByCoure_Idprof(id);
    }


}
