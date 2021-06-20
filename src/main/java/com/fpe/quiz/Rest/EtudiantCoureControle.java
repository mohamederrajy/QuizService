package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.EtudiantCoure;
import com.fpe.quiz.service.CouresService;
import com.fpe.quiz.service.EtudiantCoureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/etudaintcoure")
public class EtudiantCoureControle {

    @Autowired
    EtudiantCoureService etudiantCoureService ;

    @PostMapping("save/etudaint/{etudaintid}/coure/{idcoure}")
    @ResponseBody
    public EtudiantCoure save(@RequestBody EtudiantCoure etudiantCoure, @PathVariable Long etudaintid  , @PathVariable Long idcoure ) {

        return etudiantCoureService.save(etudiantCoure,etudaintid,idcoure);

    }

    @PutMapping("coure/{idcoure}/etudaint/{idetudaint}")
    @ResponseBody
    public EtudiantCoure Update(@RequestBody EtudiantCoure etudiantCoure, @PathVariable Long idcoure , @PathVariable Long idetudaint  ) {

        return etudiantCoureService.update(etudiantCoure,idcoure,idetudaint);

    }
    @GetMapping("coure/{idcoure}")
    @ResponseBody
    public List<EtudiantCoure> GetEtudaintCoureByCoure(@PathVariable Long idcoure) {

        return etudiantCoureService.findByCoure(idcoure);

    }
    @GetMapping("etudaint/{idetudaint}")
    @ResponseBody
    public List<EtudiantCoure> GetEtudaintCoureByEtudaint(@PathVariable Long idetudaint) {

        return etudiantCoureService.findByEtudaint(idetudaint);

    }




}
