package com.fpe.quiz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CoureVo {
    private Long idcour;
    private String description ;
    private String title ;

}
