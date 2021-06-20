package com.fpe.quiz.Dao;


import com.fpe.quiz.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionDao extends JpaRepository<Section,Long> {
   public List<Section> findSectionByCoure_Idcour(Long idcour) ;

}
