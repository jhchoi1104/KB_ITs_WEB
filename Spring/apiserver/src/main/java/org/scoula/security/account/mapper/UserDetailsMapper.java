package org.scoula.security.account.mapper;

import org.scoula.security.account.domain.MemberVO;

public interface UserDetailsMapper {
    // username을 받아서, 완성된 MemberVO을 받을 것이다.
    public MemberVO get (String username);
}
