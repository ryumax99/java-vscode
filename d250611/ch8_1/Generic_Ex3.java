package d250611.ch8_1;

import java.util.ArrayList;

public class Generic_Ex3<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T value) {
        list.add(value);
    }

    public T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Generic_Ex3<Integer> stack = new Generic_Ex3<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println("스택 자료 구조 형식으로 : 데이터 꺼내기 작업");
            System.out.println("값 : " + stack.pop());
        }
    }
}
