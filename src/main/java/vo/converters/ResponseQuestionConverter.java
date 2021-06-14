package vo.converters;

import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.ResponseQuestion;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.stereotype.Component;
import vo.QuestionVo;
import vo.ResponseQuestionVo;

@Component
public class ResponseQuestionConverter extends AbstractConverter<ResponseQuestion, ResponseQuestionVo> {
    @Override
    public ResponseQuestion toItem(ResponseQuestionVo vo) {
        if (vo == null) return null;
        ResponseQuestion item = new ResponseQuestion();
        item.setQuestion(new QuestionConverter().toItem(vo.getQuestion()));
        item.setResponse(vo.getResponse());
        item.setCorrect(vo.getCorrect());
        item.setIdreponse(vo.getIdreponse());


        return item;
    }

    @Override
    public ResponseQuestionVo toVo(ResponseQuestion item) {
        if (item == null) return null;
        ResponseQuestionVo vo = new ResponseQuestionVo();
        vo.setQuestion(new QuestionConverter().toVo(item.getQuestion()));
        vo.setResponse(item.getResponse());
        vo.setIdreponse(item.getIdreponse());
        vo.setCorrect(item.getCorrect());

        return null;
    }
}
