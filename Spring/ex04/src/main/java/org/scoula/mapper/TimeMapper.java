package org.scoula.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    @Select("SELECT sysdate()")
    public String getTime();

    // 어노테이션 없음. -> xml 파일로 sql 구성
    public String getTime2();
}
