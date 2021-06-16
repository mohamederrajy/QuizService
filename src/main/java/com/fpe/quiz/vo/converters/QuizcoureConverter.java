package com.fpe.quiz.vo.converters;

import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.stereotype.Component;
import com.fpe.quiz.vo.QuizCourseVo;

@Component("quizcoureConverter")
public class QuizcoureConverter extends AbstractConverter<QuizCourse, QuizCourseVo> {
    @Override
    public QuizCourse toItem(QuizCourseVo vo) {
        if (vo == null) return null;
        QuizCourse item = new QuizCourse();
        item.setCoure(new CourConverter().toItem(vo.getCoure()));
        item.setNumberquestions(vo.getNumberquestions());
        item.setIdquiz(vo.getIdquiz());
        item.setQuestions(new QuestionConverter().toItem(vo.getQuestions()));
        return item;
    }

    @Override
    public QuizCourseVo toVo(QuizCourse item) {
        if (item == null) return null;
        QuizCourseVo vo = new QuizCourseVo();
        vo.setNumberquestions(item.getNumberquestions());
        vo.setIdquiz(item.getIdquiz());
        vo.setQuestions(new QuestionConverter().toVo(item.getQuestions()));
        vo.setCoure(new CourConverter().toVo(item.getCoure()));
        return vo;
    }
}
