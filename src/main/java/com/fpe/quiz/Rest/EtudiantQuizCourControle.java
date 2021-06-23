package com.fpe.quiz.Rest;


import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.service.EtudiantQuizCourService;
import com.fpe.quiz.utils.AbstractConverter;
import com.fpe.quiz.vo.EtudiantQuizCourVo;
import com.fpe.quiz.vo.QuizCourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/etudiantquizcour")
public class EtudiantQuizCourControle {
    @Autowired
    EtudiantQuizCourService etudiantQuizCourService ;

    @Autowired
    @Qualifier("etudiantquizcourConverter")
    private AbstractConverter<EtudiantQuizCour, EtudiantQuizCourVo> etudiantquizcourConverter;

    @PostMapping("/etudaint/{idetudaind}/quizcoure/{idquizcour}")
    @ResponseBody
    public int save(@RequestBody EtudiantQuizCour etudiantQuizCour,@PathVariable Long idetudaind,@PathVariable Long idquizcour) {

        return etudiantQuizCourService.save(etudiantQuizCour,idetudaind,idquizcour);

    }
    @GetMapping("/getall")
    @ResponseBody
    public List<EtudiantQuizCourVo> findAll() {

        return etudiantquizcourConverter.toVo(etudiantQuizCourService.findAll()) ;
    }
    @GetMapping("/{id}")
    public EtudiantQuizCourVo findById(@PathVariable Long id) {

         return etudiantquizcourConverter.toVo(etudiantQuizCourService.findById(id)) ;
    }
    @DeleteMapping("/delete/{id}")
    public void DeleteById(@PathVariable Long id) {
        etudiantQuizCourService.deleteById(id);
    }

    @GetMapping("etudaint/{id}")
    public List<EtudiantQuizCourVo> findByEtudaint(@PathVariable Long id) {

        return etudiantquizcourConverter.toVo(etudiantQuizCourService.findEtudiantQuizCourByEtudiant(id)) ;
    }


}
