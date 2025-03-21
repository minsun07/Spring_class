package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t2")
@Lazy // layz-init=true와 같은 것
@Scope("prototype")
public class TestBean2 {
    public TestBean2(){
        System.out.println("TestBean2의 기본생성자");
    }
}
