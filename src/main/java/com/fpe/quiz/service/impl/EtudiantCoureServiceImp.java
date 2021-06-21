package com.fpe.quiz.service.impl;

import com.fpe.quiz.Dao.EtudiantCoureDao;
import com.fpe.quiz.model.Coure;
import com.fpe.quiz.model.EtudiantCoure;
import com.fpe.quiz.service.CouresService;
import com.fpe.quiz.service.EtudiantCoureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantCoureServiceImp implements EtudiantCoureService {
    @Autowired
    EtudiantCoureDao etudiantCoureDao ;



    @Autowired
    CouresService couresService ;


    @Override
    public EtudiantCoure save(EtudiantCoure etudiantCoure, Long idetudaint, Long idcoure) {
        Coure coure =  couresService.findById(idcoure);
        EtudiantCoure etudiantCoure1 = etudiantCoureDao.findEtudiantCoureByIdetudiantAndCoure_Idcour(idetudaint,idcoure);

        if(coure!=null && idetudaint!=null && etudiantCoure1==null){
            etudiantCoure.setIdetudiant(idetudaint);
            etudiantCoure.setCoure(coure);
            etudiantCoureDao.save(etudiantCoure);
        }
        return etudiantCoure;
    }

    @Override
    public List<EtudiantCoure> findAll() {
        return etudiantCoureDao.findAll();
    }

    @Override
    public EtudiantCoure findById(long id) {
        return etudiantCoureDao.findById(id).get();
    }

    @Override
    public EtudiantCoure update(EtudiantCoure etudiantCoure,Long coureid,Long idetudaint) {
       EtudiantCoure etudiantCoure1 = etudiantCoureDao.findEtudiantCoureByIdetudiantAndCoure_Idcour(idetudaint,coureid);
        etudiantCoure1.setNombresectionnonvalide(etudiantCoure.getNombresectionnonvalide());
        etudiantCoure1.setNombresectionvalide(etudiantCoure.getNombresectionvalide());
        etudiantCoureDao.save(etudiantCoure1);

        return etudiantCoure1;
    }

    @Override
    public void delete(Long id) {
        etudiantCoureDao.deleteById(id);
    }

    @Override
    public List<EtudiantCoure> findByCoure(long CoureId) {
        return etudiantCoureDao.findEtudiantCoureByCoureIdcour(CoureId);
    }

    @Override
    public List<EtudiantCoure> findByEtudaint(long eudaintId) {
        return etudiantCoureDao.findEtudiantCoureByIdetudiant(eudaintId);
    }

    @Override
    public EtudiantCoure findEtudaintCoureByEtudaintAndCour(long idetudaint, long coureid) {
        return etudiantCoureDao.findEtudiantCoureByIdetudiantAndCoure_Idcour(idetudaint,coureid);
    }
}
