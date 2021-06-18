package com.fpe.quiz.Rest;

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

    @GetMapping("dashbord/{idprof}")
    @ResponseBody
    public ProfDashboard dashboard (@PathVariable Long idprof){
        ProfDashboard profDashboard = new ProfDashboard();
       long  NumberQuizCoure = quizCourseService.NumberOfQuizCoure(idprof);
       profDashboard.setNumberquizcour(NumberQuizCoure);
       return  profDashboard;

    }
}
