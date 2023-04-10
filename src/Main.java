public class Main {
    public static void main(String[] args) {
        MyArrayList m=new MyArrayList();
        m.add(56);
        m.add(87);
        m.add(87);
        m.add(87);
        System.out.println(m.getElement(2));
//        m.clear();
//        System.out.println(m.getElement(2));
        m.delete(int index);
        System.out.println(m.getElement(int index));
    }
}