package sec3;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {

        Stack<String> st1 = new Stack<>();
        st1.push("o");
        st1.push("1");
        st1.push("2");
        st1.push("4");
        st1.push("8");

        System.out.println(st1);

        //내보내기
        st1.pop();
        st1.pop();
        System.out.println(st1);

    }
}