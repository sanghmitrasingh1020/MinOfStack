package satck1;

import java.util.*;

public class MiniOfStack {
    public static class minSt {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public minSt() {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size() {
            return (allData.size());
        }

        public void push(int val) {
            allData.push(val);
            if (minData.size() == 0 || val < minData.peek()) {
                minData.push(val);
            }
        }

        public int pop() {
            if (size() == 0) {
                System.out.println("Stack is Empty");
                return (-1);
            } else {
                int val = allData.pop();
                if (val == minData.peek()) {
                    minData.pop();
                }
                return (val);
            }
        }

        public int top() {
            if (size() == 0) {
                System.out.println("Stack is Empty");
                return (-1);
            } else {
                return (allData.peek());
            }
        }

        public int min() {
            if (size() == 0) {
                System.out.println("Stack is Empty");
                return (-1);
            }
            return (minData.peek());

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        minSt st = new minSt();
        for (int i = 0; i < 10; i++) {
            st.push(scn.nextInt());
        }
        System.out.println(st.top());
        System.out.println(st.min());
        System.out.println(st.minData);
    }
}
