package kr.taeu.aop.member;

import kr.taeu.aop.member.annotation.ClassAop;
import kr.taeu.aop.member.annotation.MethodAop;
import org.springframework.stereotype.Component;

@ClassAop
@Component
public class MemberServiceImpl implements MemberService {

    @Override
    @MethodAop("test value")
    public String hello(String param) {
        return "ok";
    }

    public String internal(String param) {
        return "ok";
    }
}
