package com.fpe.quiz.vo.converters;

import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.stereotype.Component;
import com.fpe.quiz.vo.QuestionVo;

@Component
public class QuestionConverter extends AbstractConverter<Question, QuestionVo> {

    @Override
    public Question toItem(QuestionVo vo) {
        if (vo == null) return null;
        Question item = new Question();
        item.setQuestion(vo.getQuestion());
        item.setResponses(new ResponseQuestionConverter().toItem(vo.getResponses()));
        item.setIdquestion(vo.getIdquestion());
        return item;
    }

    @Override
    public QuestionVo toVo(Question item) {
        if (item == null) return null;
        QuestionVo vo = new QuestionVo();
        vo.setIdquestion(item.getIdquestion());
        vo.setQuestion(item.getQuestion());
        vo.setResponses(new ResponseQuestionConverter().toVo(item.getResponses()) );
        return vo;
    }
}
