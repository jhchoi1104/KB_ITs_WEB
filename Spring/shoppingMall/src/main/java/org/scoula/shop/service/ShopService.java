package org.scoula.shop.service;

import org.scoula.shop.domain.ShopVO;
import org.scoula.shop.dto.ShopDTO;

import java.util.List;

public interface ShopService {
    public List<ShopDTO> getList();

    public ShopDTO get(Long no);

    public void create(ShopDTO shop);

    public void update(ShopDTO shop);

    public void delete(Long no);
}
