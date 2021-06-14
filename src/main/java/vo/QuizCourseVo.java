package vo;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Question;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class QuizCourseVo {
    private Long Idquiz;
    private Integer  numberquestions ;
    private List<QuestionVo> questions ;
    private CoureVo coure ;



}
