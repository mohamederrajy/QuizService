package com.fpe.quiz.Rest;

import com.fpe.quiz.model.Section;
import com.fpe.quiz.service.QuizCourseService;
import com.fpe.quiz.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/section")
@CrossOrigin(origins = "*")
public class SectionControle {

    @Autowired
    SectionService sectionService ;


    @PostMapping("/coure/{coureid}")
    public List<Section> save(@RequestBody List<Section> sections,@PathVariable Long coureid) {
        return sectionService.save(sections,coureid);
    }

    @PutMapping("/")
    public Section update(@RequestBody Section section) {
        return sectionService.update(section);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
         sectionService.delete(id);
    }

    @GetMapping("/")
    public List<Section> findAll() {
        return sectionService.findAll();
    }

    @GetMapping("/{id}")
    public Section findById(@PathVariable Long id) {
        return sectionService.findById(id);
    }

}
