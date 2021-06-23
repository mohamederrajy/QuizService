package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Question;
import com.fpe.quiz.model.ResponseQuestion;
import com.fpe.quiz.service.QuestionService;
import com.fpe.quiz.service.ResponseQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/response")
public class ResponseQuestionControle {
    @Autowired
    ResponseQuestionService responseQuestionService ;



    @PostMapping("/save/{QuestionId}/Response")
    public String save(@PathVariable Long QuestionId,@RequestBody ResponseQuestion responseQuestion) {
        if (responseQuestionService.save(responseQuestion,QuestionId)!=null){
            return "Bien enregistrée";
        }
        else {
            return "Non enregistrée";
        }
    }
    @GetMapping("/getall")
    @ResponseBody
    public List<ResponseQuestion> findAll() {

        return responseQuestionService.findAll();
    }
    @GetMapping("/{idResponse}")
    public ResponseQuestion findByid (@PathVariable Long idResponse)
    {
        return responseQuestionService.findResponseById(idResponse);
    }
    @GetMapping("question/{Idquestion}")
    @ResponseBody
    public List<ResponseQuestion> findAll(@PathVariable Long Idquestion) {
        return responseQuestionService.findResponseQuestionByQuestion(Idquestion);
    }

}
