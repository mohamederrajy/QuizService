package com.fpe.quiz.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idquestion;
    private String Question ;
    @OneToMany(mappedBy = "question" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference(value = "response-ques")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ResponseQuestion> responses ;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    private QuizCourse quizcourse ;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference(value = "questio-parc")
    private QuizParcour quizparcour ;


}
