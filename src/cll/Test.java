package cll;

public class Test {


    public static void main(String[] args) {
        CLL<Integer> cll = new CLL<>();
        System.out.println("Size after initialization: " + cll.size());
        cll.addFirst(100);
        System.out.println("Size after adding first element: " + cll.size());
        System.out.println(cll);
        cll.addLast(200);
        System.out.println("Size after adding last element: " + cll.size());
        System.out.println(cll);
        cll.rotate();
        System.out.println(cll);
        Integer element = cll.removeFirst();
        //Integer element2 = cll.removeFirst();
        //Integer element3 = cll.removeFirst();
        System.out.println("Contains element 100: " + cll.contains(100));
        System.out.println("Contains element 200: " + cll.contains(200));
        System.out.println("Contains element 300: " + cll.contains(300));
    }
}
