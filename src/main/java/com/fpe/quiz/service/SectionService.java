package com.fpe.quiz.service;


import com.fpe.quiz.model.Section;

import java.util.List;

public interface SectionService {
    List<Section>  save(List<Section> sections  , Long CourId );
    Section update(Section section);
    public void delete(Long id);
    List<Section> findAll();
    Section findById(Long id);
    List<Section> findSectionByCoure_Idcour (Long id);
}
