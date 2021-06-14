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
public class QuizParcour implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idquiz;
    private Integer  numberquestions ;
    @OneToMany(mappedBy = "quizparcour" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference(value = "questio-parc")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Question> questions ;

    @OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Parcour parcour ;

}
