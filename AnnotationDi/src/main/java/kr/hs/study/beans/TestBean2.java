package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t2")
public class TestBean2 {
    @Autowired
    @Qualifier("dataBean2") // 동일한 이름을 자정할 때 필요. 객체 이름을 지정할 때
    private DataBean2 data1;

    public DataBean2 getData1() {
        return data1;
    }
}
