package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
import algorytmy.structures.MyListInterface;

/**
 * Created by RENT on 2017-02-16.
 */
public class MyLinkedListTests {
    public static void main(String[] args) {
        MyListInterface myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(5);
        System.out.println(myLinkedList.get(1));
        myLinkedList.add(3);
        myLinkedList.add(-2);
        myLinkedList.add(-1);
        myLinkedList.add(-5);
        System.out.println(myLinkedList);
        myLinkedList.delete(3);
        System.out.println(myLinkedList);
        System.out.println();

        System.out.println("Homework:");

        System.out.println();

        myLinkedList.add(1, 1);
        System.out.println(myLinkedList);

        System.out.println();

        myLinkedList.put(2, 333);
        System.out.println(myLinkedList);

        System.out.println();

        MyListInterface myList = new MyLinkedList();
        myList.add(4);
        myList.add(5);
        myList.add(1,13);

        myLinkedList.addAll(myList);
        System.out.println(myList);
        System.out.println(myLinkedList);

        System.out.println();

        myLinkedList.addAll(3, myList);
        System.out.println(myLinkedList);

//        System.out.println();
//
//        MyListInterface myClonedList = myLinkedList.clone();
//        System.out.println(myClonedList);
//        myClonedList.add(0,222);
//        System.out.println(myClonedList);
//
//        System.out.println();

//        myLinkedList.addAll(myClonedList);
//        System.out.println(myLinkedList);

    }
}
