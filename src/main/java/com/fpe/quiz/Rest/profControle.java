package com.fpe.quiz.Rest;

import com.fpe.quiz.service.CouresService;
import com.fpe.quiz.service.EtudiantService;
import com.fpe.quiz.service.QuizCourseService;
import com.fpe.quiz.vo.ProfDashboard;
import com.fpe.quiz.vo.QuizCourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/prof")
public class profControle {

    @Autowired
    QuizCourseService quizCourseService ;
    @Autowired
    CouresService couresService ;

    @Autowired
    EtudiantService etudiantService ;

    @GetMapping("dashbord/{idprof}/parcour/{idparcour}")
    @ResponseBody
    public ProfDashboard dashboard (@PathVariable Long idprof,@PathVariable Long idparcour){
        ProfDashboard profDashboard = new ProfDashboard();
       long  NumberQuizCoure = quizCourseService.NumberOfQuizCoure(idprof);
       long numberEtudaint = etudiantService.NumberEtudaintParcour(idparcour);
       long NumberCoures = couresService.NumberOfCours(idprof) ;
       profDashboard.setNumberquizcour(NumberQuizCoure);
       profDashboard.setNumberCoures(NumberCoures);
       profDashboard.setNumberEtudaint(numberEtudaint);
       return  profDashboard;

    }
}
