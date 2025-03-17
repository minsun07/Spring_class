package beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1() {
        System.out.println("TestBean1의 기본생성자");
        this.data1=1;
        this.data2=1.1;
        this.data3="kim";
    }

    public void prData(){
        System.out.println("data1: " + data1);
        System.out.println("data2: " + data2);
        System.out.println("data3: " + data3);
    }
}
