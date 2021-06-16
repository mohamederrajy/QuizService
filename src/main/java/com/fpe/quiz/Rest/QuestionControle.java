package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.ResponseQuestion;
import com.fpe.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/question")
public class QuestionControle {

    @Autowired
    QuestionService questionService ;

    @PostMapping("/Save")
    @ResponseBody
    public Question save(@RequestBody Question question) {

       return questionService.save(question);

    }

    @GetMapping("/getall")
    @ResponseBody
    public List<Question> findAll() {

        return questionService.findAll();
    }
    @GetMapping("/{id}")
    public Question findById(@PathVariable Long id) {

        return questionService.findById(id);
    }
    @GetMapping("res/{id}")
    public List<ResponseQuestion> GetallRespons (@PathVariable Long id) {

        return questionService.GetallRespons(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable Long id ){
        questionService.DeleteById(id);
    }

}
