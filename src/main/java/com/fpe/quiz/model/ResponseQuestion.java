package com.fpe.quiz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseQuestion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idreponse;
    private String response ;
    private Boolean correct ;
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference(value = "response-ques")
    private Question question ;
}
