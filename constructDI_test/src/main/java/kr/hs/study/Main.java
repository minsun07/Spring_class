package kr.hs.study;

import kr.hs.study.beans.Animal;
import kr.hs.study.beans.Cat;
import kr.hs.study.beans.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Cat obj1 = ctx.getBean("t1", Cat.class);
        obj1.eat();
        obj1.go();
        obj1.catData();
        System.out.println("-----------------");

        Dog obj2 = ctx.getBean("t2", Dog.class);
        obj2.eat();
        obj2.go();
        obj2.dogData();

        ctx.close();

    }
}