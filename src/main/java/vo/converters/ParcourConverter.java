package vo.converters;

import com.fpe.quiz.model.Parcour;
import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.stereotype.Component;
import vo.ParcourVo;

@Component
public class ParcourConverter  extends AbstractConverter<Parcour, ParcourVo> {
    @Override
    public Parcour toItem(ParcourVo vo) {
        if (vo == null) return null;
        Parcour item = new Parcour();
        item.setTitle(vo.getTitle());
        item.setDescription(vo.getDescription());
        item.setIdparcour(vo.getIdparcour());
        return item;
    }

    @Override
    public ParcourVo toVo(Parcour item) {
        if (item == null) return null;
        ParcourVo vo =new ParcourVo();
        vo.setTitle(item.getTitle());
        vo.setDescription(item.getDescription());
        vo.setIdparcour(item.getIdparcour());
        return vo;
    }
}
