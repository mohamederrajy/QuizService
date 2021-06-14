package vo.converters;
import com.fpe.quiz.model.QuizParcour;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.stereotype.Component;
import vo.QuizCourseVo;
import vo.QuizParcourVo;
@Component
public class QuizParcourConverter  extends AbstractConverter<QuizParcour, QuizParcourVo> {
    @Override
    public QuizParcour toItem(QuizParcourVo vo) {
        if (vo == null) return null;
        QuizParcour item = new QuizParcour();
        item.setParcour(new ParcourConverter().toItem(vo.getParcour()));
        item.setNumberquestions(vo.getNumberquestions());
        item.setIdquiz(vo.getIdquiz());
        item.setQuestions(new QuestionConverter().toItem(vo.getQuestions()));
        return item;

    }

    @Override
    public QuizParcourVo toVo(QuizParcour item) {
         if (item == null) return null;
          QuizParcourVo vo = new QuizParcourVo();
        vo.setNumberquestions(item.getNumberquestions());
        vo.setIdquiz(vo.getIdquiz());
        vo.setQuestions(new QuestionConverter().toVo(item.getQuestions()));
        vo.setParcour(new ParcourConverter().toVo(item.getParcour()));
        return vo;
    }
}
