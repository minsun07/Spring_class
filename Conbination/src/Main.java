//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }
    public void memberUse1(){
        // 강한결합으로 객체 생성
        Member m = new Member(); // Member클래스를 private로 할 경우 에러 발생.
    }
    public static void memberUse2(Member m){  // 스프링에서 사용하는 것
        // 약한결합으로 객체생성
        Member m2 = m;
    }
}

class Member{
    String name;
    String nickName;

    public Member() { //기본 생성자
    }
}