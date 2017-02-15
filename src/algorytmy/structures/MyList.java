package algorytmy.structures;

public class MyList {
    private int[] array;
    private int size;
    private final int INITIAL_SIZE = 10;

    public MyList() {
        this.array = new int[INITIAL_SIZE];
        this.size = 0;
    }

    public int get(int index) {
        if (checkIndex(index)) {
            return array[index];
        } else {
            System.out.println("Wrong index");
            return 0;
        }
    }

    public void add(int value) {
        if (size >= array.length) {
            doubleCapacity();
        }
        array[size] = value;
        size++;

    }

    public MyList clone() {
        MyList myList = new MyList();
        myList.array = rewrite(new int[this.array.length]);
        myList.size = this.size;
        return myList;
    }

    public void put(int value) {

    }

    private void doubleCapacity() {
        int[] tmpArray = new int[size * 2];
        this.array = rewrite(tmpArray);
    }

    private int[] rewrite(int[] tmpArray) {
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = this.array[i];
        }
        return tmpArray;
    }

    private boolean checkIndex(int index) {
        boolean flag = true;
        if (index < 0 && index > size) {
            flag = false;
        }
        return flag;
    }

    public int getSize() {
        return size;
    }
}
