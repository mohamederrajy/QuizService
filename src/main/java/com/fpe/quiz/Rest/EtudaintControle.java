package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Etudiant;
import com.fpe.quiz.model.EtudiantCoure;
import com.fpe.quiz.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/etudaint")
public class EtudaintControle {

    @Autowired
    EtudiantService etudiantService ;

    @GetMapping("parcour/{idparcoure}")
    @ResponseBody
    public List<Etudiant> GetEtudaintByParcour(@PathVariable Long idparcoure) {

        return etudiantService.findByparcour(idparcoure);

    }
}
