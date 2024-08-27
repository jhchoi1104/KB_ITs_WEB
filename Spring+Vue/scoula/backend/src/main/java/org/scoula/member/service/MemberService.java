package org.scoula.member.service;

import org.scoula.member.dto.MemberDTO;
import org.scoula.member.dto.MemberJoinDTO;

public interface MemberService {
    boolean checkDuplicate(String username); // id 중복 체크

    MemberDTO get(String username); // join 결과 리턴, 상세보기

    MemberDTO join(MemberJoinDTO member);
}
