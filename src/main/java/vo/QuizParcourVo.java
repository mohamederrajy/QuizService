package vo;
import com.fpe.quiz.model.Parcour;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class QuizParcourVo {
    private Long Idquiz;
    private Integer  numberquestions ;
    private List<QuestionVo> questions ;
    private ParcourVo parcour ;

}
