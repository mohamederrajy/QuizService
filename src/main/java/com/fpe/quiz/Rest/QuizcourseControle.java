package com.fpe.quiz.Rest;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.service.QuizCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/quizcour")
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
    public List<QuizCourse> findAll() {

        return quizCourseService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public QuizCourse findById(@PathVariable long id) {

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
