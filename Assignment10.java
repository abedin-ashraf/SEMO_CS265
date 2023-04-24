/*
.(Use iterators on linked lists) Write a test program that stores 5 million integers in a linked list and test the time to traverse the list using an iterator vs. using the get(index) method. 
 */

import java.util.*;

public class Assignment10 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5000000; i++) {
            arrayList.add(i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        long iteratorTimerStart = System.currentTimeMillis();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        long iteratorTimerEnd = System.currentTimeMillis();

        System.out.println(
                "Time to traverse the list using an iterator : " + (iteratorTimerEnd - iteratorTimerStart) + " millis");

        long getTimerStart = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            linkedList.get(i);
        }
        long getTimerEnd = System.currentTimeMillis();

        System.out.println(
                "Time to traverse the list using the get(index) method " + (getTimerEnd - getTimerStart) + " millis");
    }

}
