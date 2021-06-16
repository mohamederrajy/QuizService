package com.fpe.quiz.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Parcour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idparcour;
    private String description ;
    private String title ;

    @OneToMany(mappedBy = "parcour" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference(value = "parcour-etudaint")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Etudiant> etudiants ;
}
