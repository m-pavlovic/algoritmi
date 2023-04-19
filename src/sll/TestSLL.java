package sll;

public class TestSLL {

    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<>(10, null);
//        System.out.println(node1);
//        Node<Integer> node2 = new Node<>(100, node1);
//        System.out.println(node2);
        SLL_Concrete<Integer> sll = new SLL_Concrete<>();
        System.out.println(sll);
        sll.addFirst(10);
        System.out.println(sll);
        sll.addFirst(110);
        System.out.println(sll);
        sll.addFirst(1110);
        System.out.println(sll);
        sll.addLast(-1000);
        System.out.println(sll);
        System.out.println("******************************************************************************************************************************");
        Integer element = sll.removeFirst();
        System.out.println("Removed element: " + element);
        System.out.println(sll);
        //sll.clear();
        //Integer el = sll.removeFirst();
        //System.out.println("Removed element: " + el);
        //System.out.println(sll);
        Integer elm = sll.removeLast();
        System.out.println("Removed element: " + elm);
        System.out.println(sll);
        System.out.println("******************************************************************************************************************************");
        System.out.println("Contains 10: " + sll.contains(10));
        System.out.println("Contains 110: " + sll.contains(110));
        System.out.println("Contains 1110: " + sll.contains(1110));
        System.out.println("Contains -1000: " + sll.contains(-1000));
        System.out.println("********************************************************************************************************************************");
        sll.insertAtPosition(1234, 2);
        System.out.println(sll);
        System.out.println("Size: " + sll.size());
        sll.insertAtPosition(125, 4);
        System.out.println(sll);


        //ispit algoritmi 16. i 30.6.
        //ispit osnove 23.6 i 7.7.

    }
}
