package vo.converters;

import com.fpe.quiz.model.Parcour;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.model.QuizParcour;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import vo.ParcourVo;
import vo.QuizCourseVo;

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
        vo.setIdquiz(vo.getIdquiz());
        vo.setQuestions(new QuestionConverter().toVo(item.getQuestions()));
        vo.setCoure(new CourConverter().toVo(item.getCoure()));
        return vo;
    }
}
