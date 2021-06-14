package vo.converters;

import com.fpe.quiz.model.Coure;

import com.fpe.quiz.utils.AbstractConverter;
import org.springframework.stereotype.Component;
import vo.CoureVo;

@Component
public class CourConverter extends AbstractConverter<Coure, CoureVo> {
    @Override
    public Coure toItem(CoureVo vo) {
        if (vo == null) return null;
        Coure item = new Coure();
        item.setTitle(vo.getTitle());
        item.setDescription(vo.getDescription());
        item.setIdcour(vo.getIdcour());
        return item;
    }

    @Override
    public CoureVo toVo(Coure item) {
        if (item == null) return null;
        CoureVo vo = new CoureVo();
        vo.setTitle(item.getTitle());
        vo.setDescription(item.getDescription());
        vo.setIdcour(item.getIdcour());
        return vo;
    }
}
