package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.service.CouresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/cours")
public class CourseControle {
    @Autowired
    CouresService couresService ;

    @PostMapping("/Save")
    @ResponseBody
    public Coure save(@RequestBody Coure coure) {

        return couresService.save(coure);

    }
    @GetMapping("/getall")
    @ResponseBody
    public List<Coure> findAll() {

        return couresService.findAll();
    }

    @GetMapping("/{id}")
    public Coure findById(@PathVariable Long id) {

        return couresService.findById(id);
    }



}
