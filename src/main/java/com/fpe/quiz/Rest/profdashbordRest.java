package com.fpe.quiz.Rest;

import com.fpe.quiz.service.CouresService;
import com.fpe.quiz.service.QuizCourseService;
import com.fpe.quiz.vo.ProfDashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/prof")
public class profdashbordRest {
    @Autowired
    QuizCourseService quizCourseService ;
    @Autowired
    CouresService couresService ;



    @GetMapping("dashbord/{idprof}/parcour/{idparcour}")
    @ResponseBody
    public ProfDashboard dashboard (@PathVariable Long idprof, @PathVariable Long idparcour){
        ProfDashboard profDashboard = new ProfDashboard();
        long  NumberQuizCoure = quizCourseService.NumberOfQuizCoure(idprof);
        long NumberCoures = couresService.NumberOfCours(idprof) ;
        profDashboard.setNumberquizcour(NumberQuizCoure);
        profDashboard.setNumberCoures(NumberCoures);
        return  profDashboard;

    }

}
