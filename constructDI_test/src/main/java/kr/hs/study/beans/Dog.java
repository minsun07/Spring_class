package kr.hs.study.beans;

public class Dog implements Animal{
    private String color;
    private int leg;
    private Owner owner;

     @Override
     public void eat() {
         System.out.println("개가 쫩쫩");
     }

     @Override
     public void go() {
         System.out.println("개가 쿵쿵");
     }

    public Dog(String color, int leg, Owner owner){
        this.color =color;
        this.leg = leg;
        this.owner = owner;
    }

    public void dogData(){
        System.out.println("color : "+ color);
        System.out.println("leg : "+ leg);
        System.out.println("owner : "+ owner);
        owner.onData();
    }
}
