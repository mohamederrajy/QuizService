package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Parcour;
import com.fpe.quiz.service.ParcourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/parcour")
public class ParcourControle {
    @Autowired
    ParcourService parcourService;

    @PostMapping("")
    @ResponseBody
    public Parcour save(@RequestBody Parcour parcour) {

        return parcourService.save(parcour);

    }
    @GetMapping("/getall")
    @ResponseBody
    public List<Parcour> findAll() {

        return parcourService.findAll();
    }

    @GetMapping("/{id}")
    public Parcour findById(@PathVariable Long id) {

        return parcourService.findById(id);
    }

}
