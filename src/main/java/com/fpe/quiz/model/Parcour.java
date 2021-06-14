package com.fpe.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
