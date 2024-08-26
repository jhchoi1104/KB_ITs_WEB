package org.scoula.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.shop.domain.ShopVO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShopDTO {
    private Long no;
    private String itemName;
    private String brandName;
    private String category;
    private int price;
    private int discountRate;
    private int numberSales;
    private String sex;
    private String img;

    public static ShopDTO of(ShopVO vo) {
        return vo == null ? null : ShopDTO.builder()
                .no(vo.getNo())
                .itemName(vo.getItemName())
                .brandName(vo.getBrandName())
                .category(vo.getCategory())
                .discountRate(vo.getDiscountRate())
                .img(vo.getImg())
                .numberSales(vo.getNumberSales())
                .price(vo.getPrice())
                .sex(vo.getSex())
                .build();
    }
    public ShopVO toVO() {
        return ShopVO.builder()
                .no(no)
                .itemName(itemName)
                .brandName(brandName)
                .category(category)
                .discountRate(discountRate)
                .numberSales(numberSales)
                .price(price)
                .img(img)
                .sex(sex)
                .build();
    }

}
