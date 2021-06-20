package com.fpe.quiz.vo.converters;

import com.fpe.quiz.model.EtudiantQuizCour;
import com.fpe.quiz.utils.AbstractConverter;
import com.fpe.quiz.vo.EtudiantQuizCourVo;
import org.springframework.stereotype.Component;

@Component
public class EtudiantquizcourConverter extends AbstractConverter<EtudiantQuizCour, EtudiantQuizCourVo> {

    @Override
    public EtudiantQuizCour toItem(EtudiantQuizCourVo vo) {
        if (vo == null) return null;
        EtudiantQuizCour item = new EtudiantQuizCour();
        item.setId(vo.getId());
        item.setNote(vo.getNote());
        item.setDatedepass(vo.getDatedepass());
        item.setIdetudiant(vo.getIdetudiant());
        item.setQuizCourse(new QuizcoureConverter().toItem(vo.getQuizCourse()));
        return item;

    }

    @Override
    public EtudiantQuizCourVo toVo(EtudiantQuizCour item) {
        if (item == null) return null;
        EtudiantQuizCourVo vo = new EtudiantQuizCourVo();
        vo.setId(item.getId());
        vo.setNote(item.getNote());
        vo.setDatedepass(item.getDatedepass());
        vo.setIdetudiant(item.getIdetudiant());
        vo.setQuizCourse(new QuizcoureConverter().toVo(item.getQuizCourse()));

        return vo;
    }
}
