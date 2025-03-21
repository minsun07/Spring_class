package kr.hs.study;

import kr.hs.study.beans.Member;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config_annotation.xml");

        Member obj1 = ctx.getBean("t1", Member.class);
        System.out.println(obj1.getName());
        System.out.println(obj1.getNickName());
        System.out.println(obj1.getAddr());
        System.out.println(obj1.getHobby().getHobby_name()); // soccer 출력됨
        System.out.println(obj1.getHobby()); // Hobby의 주소가 출력됨.


        ctx.close();
    }
}