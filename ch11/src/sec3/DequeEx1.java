package sec3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeEx1 {

    public static void main(String[] args) {
        Deque<String> dq1 = new ArrayDeque<>();
        Deque<String> dq2 = new LinkedBlockingDeque<>();
        Deque<String> dq3 = new ConcurrentLinkedDeque<>();
        Deque<String> dq4 = new LinkedList<>();

        dq1.add("0");
        dq1.push("1"); //현재(0)의 앞에 추가됨
        dq1.offer("2"); //현재(0)의 뒤에 추가됨
        dq1.add("3"); //맨뒤에
        dq1.push("4"); //현재(3)의 앞에
        dq1.offer("5"); //현재(3)의 뒤에
        dq1.addFirst("6"); // 가장 처음에
        dq1.addLast("7"); // 가장 뒤에
        dq1.offerFirst("8"); //
        dq1.offerLast("9");

        System.out.println(dq1);

        //요소제거
        dq1.remove("4");
        dq1.removeFirst();
        dq1.removeLast();
        dq1.poll(); //맨끝에 꺼내기
        dq1.pollFirst();
        dq1.pollLast();
        dq1.pop();

        System.out.println(dq1);

        // 값 접근
        System.out.println(dq1.peek());
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.peekLast());
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());














    }
}
