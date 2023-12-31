package sec1;

public class Child extends Man {

    // 추상화 된 클래스를 상속 받앙 구현하는 경우 추상메서드를 모두 구현 내용을 기술할 수 있도록 오버라이딩 해야한다.
    @Override
    public void method1() {
        System.out.println("자식 메소드1");
    }

    @Override
    public int method2() {
        return 2;
    }

    @Override
    public void method3(int no) {
        System.out.println("후손 메소드2"+no);
    }

    @Override
    public int method4(int no) {
        return no + 1;
    }
}
