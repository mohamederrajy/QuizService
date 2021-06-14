package com.fpe.quiz.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<T, VO> {

    public abstract T toItem(VO vo);

    public abstract VO toVo(T item);

    public List<T> toItem(List<VO> vos) {
        if (vos == null || vos.isEmpty()) {
            return new ArrayList<>();
        } else {
            List<T> items = new ArrayList();
            vos.forEach((vo) -> {
                items.add(toItem(vo));
            });
            return items;

        }
    }

    public List<VO> toVo(List<T> items) {
        if (items == null || items.isEmpty()) {
            return new ArrayList<>();
        } else {
            List<VO> vos = new ArrayList();
            items.forEach((item) -> {
                vos.add(toVo(item));
            });
            return vos;
        }
    }

}
