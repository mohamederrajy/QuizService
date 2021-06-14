package com.fpe.quiz.Rest;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.service.QuizCourseService;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import vo.QuizCourseVo;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/quizcoure")
public class QuizcourseControle {
    @Autowired
    QuizCourseService quizCourseService ;

 

    @PostMapping("/save/{CoursId}")
    @ResponseBody
    public QuizCourse save(@PathVariable Long CoursId,@RequestBody QuizCourse quizCourse) {

        return quizCourseService.save(quizCourse,CoursId);

    }
    @GetMapping("/getall")
    @ResponseBody
    public List<QuizCourseVo> findAll() {

        return quizCourseService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public QuizCourseVo findById(@PathVariable long id) {

        return quizCourseService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
     public void DeleteQuiz(@PathVariable Long id) {
        quizCourseService.DeleteQuiz(id);
    }

    @GetMapping("cour/{Idcour}")
    @ResponseBody
    public QuizCourse findQuizCoursesByCoureIdcour(@PathVariable Long Idcour) {
        return quizCourseService.findQuizCoursesByCoureIdcour(Idcour);
    }

}
