package algorytmy;

import algorytmy.structures.MyList;

import java.lang.reflect.Array;

public class Application {
    public static void main(String[] args) {
        MyList myList = initMyList();
        MyList clonedList = myList.clone();
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();

        clonedList.add(5);
        clonedList.add(5);
        clonedList.add(5);
        clonedList.delete(10);
        clonedList.delete(9);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.delete(7);
        clonedList.add(0,222);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.put(0,2232);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();

//        myList.delete(1);
//        System.out.println(myList.get(1));

    }

    private static MyList initMyList(){
        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
        myList.add(-3);
        myList.add(-1);
        myList.add(0);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(-3);
        myList.add(-1);
        myList.add(0);
        myList.add(3);
        myList.add(2);
        return myList;
    }
}
