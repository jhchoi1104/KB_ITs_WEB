package org.scoula.common.pagination;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// 접근 제한을 private 생성자로 운영하고 싶을 때
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PageRequest {
    private int page; // 요청 페이지
    private int amount; // 한 페이지 당 데이터 건수

     public PageRequest() {
         page = 1;
         amount = 10;
     }

     public static PageRequest of(int page, int amount){
         return new PageRequest(page, amount);
     }

     public int getOffset() {
         return (page - 1)* amount;
     }
}
