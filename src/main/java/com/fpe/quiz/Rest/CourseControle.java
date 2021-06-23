package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Section;
import com.fpe.quiz.service.CouresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cours")
public class CourseControle {
    @Autowired
    CouresService couresService ;

    @PostMapping("/save/parcour/{parcourid}/prof/{idprof}")
    @ResponseBody
    public Coure save(@RequestBody Coure coure,@PathVariable Long parcourid  ,@PathVariable Long idprof ) {

        return couresService.save(coure,parcourid,idprof);

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

    @GetMapping("parcour/{id}")
    public List<Coure> findCoursesByIdParcours(@PathVariable Long id) {
        return couresService.findCoureByParcour_Idparcour(id);
    }
    @GetMapping("prof/{id}")
    public List<Coure> findCouresByProf(@PathVariable Long id) {
        return couresService.findCourByProfId(id);
    }




}
