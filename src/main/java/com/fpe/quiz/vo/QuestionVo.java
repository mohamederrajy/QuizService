package com.fpe.quiz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuestionVo {
    private Long idquestion;
    private String Question ;
    private List<ResponseQuestionVo> responses ;


}
