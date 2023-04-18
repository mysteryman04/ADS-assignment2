public class Main2 {
    public static void main(String[] args) {
        MyLinkedList<Integer> m=new MyLinkedList<>();
        m.add(76);
        m.add(23);
        m.add(66);
        m.add(87);
        m.add(45);
        System.out.println(m.contains(23));
        m.remove(23);
//        m.clear();
//        System.out.println(m.contains(23));
        System.out.println(m.get(3));
        m.add(23,3);
    }
}
