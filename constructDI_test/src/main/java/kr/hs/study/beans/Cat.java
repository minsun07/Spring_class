package kr.hs.study.beans;

import kr.hs.study.beans.Animal;
import kr.hs.study.beans.Owner;

public class Cat implements Animal {
    private String color;
    private int leg;
    private Owner owner;

    @Override
    public void eat() {
        System.out.println("고양이가 냠냠");
    }

    @Override
    public void go() {
        System.out.println("고양이가 사뿐사뿐");
    }

    public Cat(String color, int leg, Owner owner){
        this.color =color;
        this.leg = leg;
        this.owner = owner;
    }

    public void catData(){
        System.out.println("color : "+ color);
        System.out.println("leg : "+ leg);
        System.out.println("owner : "+ owner);
        owner.onData();
    }
}


