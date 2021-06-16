package com.fpe.quiz.vo.converters;

import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.model.EtudiantQuizParcour;
import com.fpe.quiz.utils.AbstractConverter;
import com.fpe.quiz.vo.EtudiantQuizCourVo;
import com.fpe.quiz.vo.EtudiantQuizParcourVo;
import org.springframework.stereotype.Component;

@Component
public class EtudiantquizparcourConverter extends AbstractConverter<EtudiantQuizParcour, EtudiantQuizParcourVo> {
    @Override
    public EtudiantQuizParcour toItem(EtudiantQuizParcourVo vo) {
        if (vo == null) return null;
        EtudiantQuizParcour item = new EtudiantQuizParcour();
        item.setId(vo.getId());
        item.setNote(vo.getNote());
        item.setDatedepass(vo.getDatedepass());
        item.setEtudiant(vo.getEtudiant());
        item.setQuizParcour(vo.getQuizParcour());
        return item;

    }

    @Override
    public EtudiantQuizParcourVo toVo(EtudiantQuizParcour item) {
        if (item == null) return null;
        EtudiantQuizParcourVo vo = new EtudiantQuizParcourVo();
        vo.setId(item.getId());
        vo.setNote(item.getNote());
        vo.setDatedepass(item.getDatedepass());
        vo.setEtudiant(item.getEtudiant());
        vo.setQuizParcour(item.getQuizParcour());

        return vo;
    }
}
