package com.fpe.quiz.Rest;


import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.model.EtudiantQuizParcour;
import com.fpe.quiz.service.EtudiantQuizParcourService;
import com.fpe.quiz.utils.AbstractConverter;
import com.fpe.quiz.vo.EtudiantQuizCourVo;
import com.fpe.quiz.vo.EtudiantQuizParcourVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/etudiantquizparcour")
public class EtudiantQuizParcourControle {
    @Autowired
    EtudiantQuizParcourService etudiantQuizParcourService ;

    @Autowired
    @Qualifier("etudiantquizparcourConverter")
    private AbstractConverter<EtudiantQuizParcour, EtudiantQuizParcourVo> etudiantquizparcourConverter;

    @PostMapping("/etudaint/{idetudaind}/quizparcour/{idquizparcour}")
    @ResponseBody
    public int save(@RequestBody EtudiantQuizParcour etudiantQuizParcour, @PathVariable Long idetudaind, @PathVariable Long idquizparcour) {

        return etudiantQuizParcourService.save(etudiantQuizParcour,idetudaind,idquizparcour);

    }

    @GetMapping("/getall")
    @ResponseBody
    public List<EtudiantQuizParcourVo> findAll() {

        return etudiantquizparcourConverter.toVo(etudiantQuizParcourService.findAll()) ;
    }

    @GetMapping("/{id}")
    public EtudiantQuizParcourVo findById(@PathVariable Long id) {

        return etudiantquizparcourConverter.toVo(etudiantQuizParcourService.findById(id)) ;
    }
    @DeleteMapping("/delete/{id}")
    public void DeleteById(@PathVariable Long id) {
        etudiantQuizParcourService.deleteById(id);
    }
    @GetMapping("etudaint/{id}")
    public EtudiantQuizParcourVo findByEtudaint(@PathVariable Long id) {

        return etudiantquizparcourConverter.toVo(etudiantQuizParcourService.findEtudiantQuizCourByEtudiant(id)) ;
    }

}

