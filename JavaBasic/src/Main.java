//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //HelloWorldEn 객체 hello1 만들고
        //h1 출력
//        HelloWorldEn h1 = new HelloWorldEn();
        HelloWorldKr h1 = new HelloWorldKr();
        callmethod(h1);


    }
        public static void callmethod(HelloWorldKr h1){ // static메소드는 객체 생성없이 메소드를 호출할 수 있다.
            h1.sayHello();
        }


}