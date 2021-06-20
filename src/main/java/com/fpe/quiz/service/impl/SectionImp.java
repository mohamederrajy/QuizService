package com.fpe.quiz.service.impl;


import com.fpe.quiz.Dao.CouresDao;
import com.fpe.quiz.Dao.SectionDao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.Section;
import com.fpe.quiz.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionImp implements SectionService {
    @Autowired
     SectionDao sectionDao;
    @Autowired
     CouresDao couresDao;


    @Override
    public List<Section>  save(List<Section> sections ,Long courid) {

        Coure coure = couresDao.findById(courid).get();
        for(Section section : sections){
            section.setCoure(coure);
            sectionDao.save(section);
        }

        return sections;
    }

    @Override
    public Section update(Section section) {
        if (section == null) return null;
        if (!sectionDao.existsById(section.getId())) return null;
        return sectionDao.save(section);
    }

    @Override
    public void  delete(Long id) {
        sectionDao.deleteById(id);

    }

    @Override
    public List<Section> findAll() {
        return sectionDao.findAll();
    }

    @Override
    public Section findById(Long id) {
        return sectionDao.findById(id).orElse(null);
    }

    @Override
    public List<Section> findSectionByCoure_Idcour(Long id) {
        return sectionDao.findSectionByCoure_Idcour(id);
    }
}
