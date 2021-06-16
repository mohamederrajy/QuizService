package com.fpe.quiz.Rest;


import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.model.QuizParcour;
import com.fpe.quiz.service.QuizParcourService;
import com.fpe.quiz.utils.AbstractConverter;
import com.fpe.quiz.vo.EtudiantQuizCourVo;
import com.fpe.quiz.vo.QuizParcourVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/quizparcour")
public class QuizParcourControle {
    @Autowired
    QuizParcourService quizParcourService ;


    @Autowired
    @Qualifier("quizparcourConverter")
    private AbstractConverter<QuizParcour, QuizParcourVo> quizparCourconverter;

    @PostMapping("/{ParcourId}")
    @ResponseBody
    public QuizParcour save(@PathVariable Long ParcourId, @RequestBody QuizParcour quizParcour) {

        return quizParcourService.save(quizParcour,ParcourId);

    }
    @GetMapping("/getall")
    @ResponseBody
    public List<QuizParcourVo> findAll() {

        return quizparCourconverter.toVo(quizParcourService.findAll());
    }
    @GetMapping("/{id}")
    @ResponseBody
    public QuizParcourVo findById(@PathVariable long id) {

        return quizparCourconverter.toVo(quizParcourService.findById(id));
    }
    @DeleteMapping("{id}")
    public void DeleteQuiz(@PathVariable Long id) {
        quizParcourService.DeleteQuiz(id);
    }

    @GetMapping("parcour/{idparcour}")
    @ResponseBody
    public QuizParcourVo findQuizParcourByParcour(@PathVariable Long idparcour) {
        return quizparCourconverter.toVo(quizParcourService.findQuizParcourByParcour(idparcour));
    }
}
