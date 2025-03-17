package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

/*        원래라면 이렇게 메소드를 생성해야하지만 없이도 할 수 있다.
        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        obj1.initMethod();*/


        ctx.close();
    }
}