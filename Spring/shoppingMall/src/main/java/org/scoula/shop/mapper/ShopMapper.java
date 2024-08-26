package org.scoula.shop.mapper;

import org.scoula.shop.domain.ShopVO;

import java.util.List;

public interface ShopMapper {
    public List<ShopVO> getList();

    public ShopVO get(Long no);

    public void create(ShopVO vo);

    public void update(ShopVO vo);

    public void delete(Long no);
}
