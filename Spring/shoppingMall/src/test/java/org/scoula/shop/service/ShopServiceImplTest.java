package org.scoula.shop.service;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.scoula.shop.dto.ShopDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
class ShopServiceImplTest {

    @Autowired
    private ShopService service;

    @Test
    void getList() {
        List<ShopDTO> list = service.getList();

        for (ShopDTO shop: list) {
            log.info(shop);
        }
    }

    @Test
    void get() {
        log.info(service.get(2L));
    }

    @Transactional
    @Test
    void create() {
        ShopDTO shop = new ShopDTO();
        shop.setBrandName("종현");
        shop.setCategory("나이키");
        shop.setDiscountRate(45);
        shop.setImg("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjExMjlfNzcg%2FMDAxNjY5Njc4ODIzMTUy.OTrbMmlSyi568dyg7mx-3v0IH2aWXS29GcbljO0ysXsg.Zb7fjyLQq1QPHZMVRm7UvveXO6O7ipYRYobyb0dFtg4g.JPEG.santa246%2FBandPhoto%25A3%25DF46967139874.jpg&type=ofullfill340_600_png");
        shop.setItemName("좡빈");
        shop.setNumberSales(100);
        shop.setPrice(100000);
        shop.setSex("남자");

        service.create(shop);
    }

    @Transactional
    @Test
    void update() {
        ShopDTO shop = new ShopDTO();
        shop.setNo(2L);
        shop.setBrandName("종현");
        shop.setCategory("나이키");
        shop.setDiscountRate(45);
        shop.setImg("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjExMjlfNzcg%2FMDAxNjY5Njc4ODIzMTUy.OTrbMmlSyi568dyg7mx-3v0IH2aWXS29GcbljO0ysXsg.Zb7fjyLQq1QPHZMVRm7UvveXO6O7ipYRYobyb0dFtg4g.JPEG.santa246%2FBandPhoto%25A3%25DF46967139874.jpg&type=ofullfill340_600_png");
        shop.setItemName("좡빈");
        shop.setNumberSales(100);
        shop.setPrice(100000);
        shop.setSex("남자");

        service.update(shop);
    }


    @Transactional
    @Test
    void delete() {
        service.delete(2L);
    }
}