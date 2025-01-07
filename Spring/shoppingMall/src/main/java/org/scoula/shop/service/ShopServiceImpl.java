package org.scoula.shop.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.shop.domain.ShopVO;
import org.scoula.shop.dto.ShopDTO;
import org.scoula.shop.mapper.ShopMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j
@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {
    final private ShopMapper mapper;

    @Override
    public List<ShopDTO> getList() {
        return mapper.getList().stream()
                .map(ShopDTO::of)
                .toList();
    }

    @Override
    public ShopDTO get(Long no) {
        ShopDTO shop = ShopDTO.of(mapper.get(no));
        return Optional.ofNullable(shop).orElseThrow(NoSuchFieldError::new);
    }

    @Override
    public void create(ShopDTO shop) {
        ShopVO vo = shop.toVO();
        mapper.create(vo);
    }

    @Override
    public void update(ShopDTO shop) {
        ShopVO vo = shop.toVO();
        mapper.update(vo);
    }

    @Override
    public void delete(Long no) {
        mapper.delete(no);
    }
}
