package vo;

import com.fpe.quiz.model.Question;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseQuestionVo {
    private Long Idreponse;
    private String response ;
    private Boolean correct ;
    private QuestionVo question ;

}
