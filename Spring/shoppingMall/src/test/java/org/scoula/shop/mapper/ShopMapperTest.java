package org.scoula.shop.mapper;

import lombok.extern.log4j.Log4j;
import org.apache.xerces.parsers.CachingParserPool;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.scoula.shop.domain.ShopVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
class ShopMapperTest {

    @Autowired
    private ShopMapper mapper;

    @Test
    void getList() {
        for(ShopVO vo: mapper.getList()) {
            log.info(vo);
        }
    }

    @Test
    void get() {
        ShopVO vo = mapper.get(1L);
        log.info(vo);
    }

    @Transactional
    @Test
    void create() {
        ShopVO vo = new ShopVO();
        vo.setBrandName("종현");
        vo.setCategory("나이키");
        vo.setDiscountRate(45);
        vo.setImg("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjExMjlfNzcg%2FMDAxNjY5Njc4ODIzMTUy.OTrbMmlSyi568dyg7mx-3v0IH2aWXS29GcbljO0ysXsg.Zb7fjyLQq1QPHZMVRm7UvveXO6O7ipYRYobyb0dFtg4g.JPEG.santa246%2FBandPhoto%25A3%25DF46967139874.jpg&type=ofullfill340_600_png");
        vo.setItemName("정빈");
        vo.setNumberSales(100);
        vo.setPrice(100000);
        vo.setSex("남자");

        mapper.create(vo);
        log.info(vo);
    }

    @Transactional
    @Test
    void update() {
        ShopVO vo = new ShopVO();
        vo.setNo(2L);
        vo.setBrandName("종현");
        vo.setCategory("나이키");
        vo.setDiscountRate(45);
        vo.setImg("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjExMjlfNzcg%2FMDAxNjY5Njc4ODIzMTUy.OTrbMmlSyi568dyg7mx-3v0IH2aWXS29GcbljO0ysXsg.Zb7fjyLQq1QPHZMVRm7UvveXO6O7ipYRYobyb0dFtg4g.JPEG.santa246%2FBandPhoto%25A3%25DF46967139874.jpg&type=ofullfill340_600_png");
        vo.setItemName("좡빈");
        vo.setNumberSales(100);
        vo.setPrice(100000);
        vo.setSex("남자");


        log.info(vo);

        mapper.update(vo);

    }

    @Transactional
    @Test
    void delete() {
        mapper.delete(1L);
    }
}