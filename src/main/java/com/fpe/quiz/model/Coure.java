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
public class Coure implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcour;
    private String description ;
    private String title ;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonBackReference(value = "parcour-coure")
    private Parcour parcour ;

    @OneToOne
    @JsonBackReference
    private Prof prof ;

    @OneToMany(mappedBy = "coure" ,cascade = CascadeType.ALL)
    @JsonManagedReference(value = "Coure-section")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Section> section;
}
