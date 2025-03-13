package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//        config.xml파일을 로딩해서 객체를 생성하고 보관한다.

        //2. 객체를 가지고 와서 주소값 출력
//        TestBean obj1 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj1 : " + obj1);
//
//
//        TestBean obj2 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj2 : " + obj2);
//        System.out.println("------------------------------------------");
//
//        // t2객체 가져와서 obj3에 주소값 출력 --> config.xml에서 scope="prototype"을 했기때문, 객체를 새로 생성한다는 의미
//        TestBean obj3 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj3 : " + obj3);
//
//        // t2객체 가져와서 obj4에 주소값 출력
//        TestBean obj4 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj4 : " + obj4);
        ctx.close();
    }
}