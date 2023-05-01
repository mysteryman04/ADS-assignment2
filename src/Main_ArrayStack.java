public class Main_ArrayStack {
    public static void main(String[] args) {
        MyArrayListStack<Integer> stack = new MyArrayListStack<>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
