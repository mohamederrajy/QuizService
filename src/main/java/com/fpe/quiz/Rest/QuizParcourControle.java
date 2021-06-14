package com.fpe.quiz.Rest;


import com.fpe.quiz.model.QuizParcour;
import com.fpe.quiz.service.QuizParcourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.converters.QuizcoureConverter;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/quizparcour")
public class QuizParcourControle {
    @Autowired
    QuizParcourService quizParcourService ;


    @PostMapping("/{ParcourId}")
    @ResponseBody
    public QuizParcour save(@PathVariable Long ParcourId, @RequestBody QuizParcour quizParcour) {
       // System.out.println(quizParcour);
        return quizParcourService.save(quizParcour,ParcourId);

    }
    @GetMapping("/getall")
    @ResponseBody
    public List<QuizParcour> findAll() {

        return quizParcourService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public QuizParcour findById(@PathVariable long id) {

        return quizParcourService.findById(id);
    }
    @DeleteMapping("{id}")
    public void DeleteQuiz(@PathVariable Long id) {
        quizParcourService.DeleteQuiz(id);
    }

    @GetMapping("parcour/{idparcour}")
    @ResponseBody
    public QuizParcour findQuizParcourByParcour(@PathVariable Long idparcour) {
        return quizParcourService.findQuizParcourByParcour(idparcour);
    }
}
