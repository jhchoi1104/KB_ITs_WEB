package org.scoula.member.service;

import org.scoula.member.dto.MemberDTO;
import org.scoula.member.dto.MemberJoinDTO;
import org.scoula.member.dto.MemberUpdateDTO;
import org.scoula.security.account.domain.MemberVO;

public interface MemberService {
    boolean checkDuplicate(String username); // id 중복 체크

    MemberDTO get(String username); // join 결과 리턴, 상세보기

    MemberDTO join(MemberJoinDTO member);

    MemberDTO update(MemberUpdateDTO member);
}
