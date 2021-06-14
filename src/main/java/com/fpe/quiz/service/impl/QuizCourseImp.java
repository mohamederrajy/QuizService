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
import vo.QuizCourseVo;
import vo.converters.QuizcoureConverter;

import java.util.List;

@Service
public class QuizCourseImp  implements QuizCourseService {

    @Autowired
    QuizCourseDao quizCourseDao ;

    @Autowired
    CouresService couresService;

    @Autowired
    @Qualifier("quizcoureConverter")
    private AbstractConverter<QuizCourse,QuizCourseVo> quizcoureConverter;

    @Override
    public List<QuizCourseVo> findAll() {
        return  quizcoureConverter.toVo(quizCourseDao.findAll());
    }

    @Override
    public QuizCourseVo findById(long id) {
        return quizcoureConverter.toVo(quizCourseDao.findById(id).get());
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


}
