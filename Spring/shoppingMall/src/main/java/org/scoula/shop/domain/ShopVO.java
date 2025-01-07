package org.scoula.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShopVO {
    private Long no;
    private String itemName;
    private String brandName;
    private String category;
    private int price;
    private int discountRate;
    private int numberSales;
    private String sex;
    private String img;
}
