package com.fpe.quiz.vo;
import com.fpe.quiz.model.QuizCourse;
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
