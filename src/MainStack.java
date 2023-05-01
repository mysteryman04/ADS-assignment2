public class MainStack {
    public static void main(String[] args) {
        MyLinkedListStack<Integer> stack = new MyLinkedListStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

//        int popped = stack.pop();
//        System.out.println("Popped element: " + popped);
        int peeked = stack.peek();
        System.out.println("Peeked element: " + peeked);

    }

}
