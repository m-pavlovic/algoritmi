package predavanje.liste;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

    private static final int LWR = -10;
    private static final int UPR = 100;

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(10);
        createAndPopulateArrayList(myList, 5);
        System.out.println("The list contains: " + myList);
        myList.add(myList.size()-1, -100);
        System.out.println("The list contains: " + myList);
        //myList.clear();
        //System.out.println("The list contains: " + myList);
        boolean containsEl = myList.contains(24);
        System.out.println("The list contains 24: " + containsEl);
        int el = myList.get(33);
        System.out.println("The element at index 33 is: " + el);  //--> IndexOutOfBoundsException
    }


    public static void createAndPopulateArrayList(ArrayList<Integer> list, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            list.add(ThreadLocalRandom.current().nextInt(LWR, UPR));
        }
        System.out.println("Finished populating the list.");
    }
}
