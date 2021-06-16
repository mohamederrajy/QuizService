package com.fpe.quiz.Rest;
import com.fpe.quiz.model.QuizCourse;
import com.fpe.quiz.service.QuizCourseService;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import com.fpe.quiz.vo.QuizCourseVo;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/quizcoure")
public class QuizcourseControle {
    @Autowired
    QuizCourseService quizCourseService ;

    @Autowired
    @Qualifier("quizcoureConverter")
    private AbstractConverter<QuizCourse,QuizCourseVo> quizcoureConverter;

    @PostMapping("/save/{CoursId}")
    @ResponseBody
    public QuizCourse save(@PathVariable Long CoursId,@RequestBody QuizCourse quizCourse) {

        return quizCourseService.save(quizCourse,CoursId);

    }
    @GetMapping("/getall")
    @ResponseBody
    public List<QuizCourseVo> findAll() {

        return quizcoureConverter.toVo(quizCourseService.findAll());
    }
    @GetMapping("/{id}")
    @ResponseBody
    public QuizCourseVo findById(@PathVariable long id) {

        return quizcoureConverter.toVo(quizCourseService.findById(id));
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
