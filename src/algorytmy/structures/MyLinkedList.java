package algorytmy.structures;

/**
 * Created by RENT on 2017-02-16.
 */
public class MyLinkedList implements MyListInterface {

    private int value;

    private MyLinkedList next;

    public MyLinkedList() {
    }

    private MyLinkedList(int value) {
        this.value = value;
    }


    @Override
    public void add(int value) {
        MyLinkedList myLinkedList = getLast();
        MyLinkedList tmpObject = new MyLinkedList();
        tmpObject.value = value;
        myLinkedList.next = tmpObject;

    }

    private MyLinkedList getLast() {
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void add(int index, int value) {
        if (checkIndex(index)) {
            MyLinkedList previousElement = getElement(index - 1);
            MyLinkedList shiftingElement = getElement(index);
            MyLinkedList addingElement = new MyLinkedList(value);

            addingElement.next = shiftingElement;
            previousElement.next = addingElement;
        }

    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < getSize();
    }

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = getElement(index);
        if (myLinkedList == null) {
            System.out.println("Wrong index");
            return 0;
        }
        return myLinkedList.value;
    }

    private MyLinkedList getElement(int index) {
        MyLinkedList myLinkedList = this;
        if (index < -1) {
            return null;
        }
        for (int i = 0; i <= index; i++) {
            if (myLinkedList.next == null) {
                return null;
            }
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void put(int index, int value) {
        MyLinkedList changedElement = getElement(index);
        if (changedElement != null) {
            changedElement.value = value;
        }
    }

    @Override
    public void addAll(MyListInterface myList) {
        for (int i = 0; i < myList.getSize(); i++) {
            this.add(myList.get(i));
        }
    }

    @Override
    public void addAll(int index, MyListInterface myList) {
        for (int i = 0; i < myList.getSize(); i++) {
            this.add(index + i, myList.get(i));
        }
    }

    @Override
    public void delete(int index) {
        if (index < getSize()) {
            MyLinkedList previusElement = getElement(index - 1);
            MyLinkedList deletingElement = getElement(index);
            previusElement.next = deletingElement.next;
            deletingElement.next = null;
        }
    }

    @Override
    public MyListInterface clone() {
        MyListInterface clonedList = new MyLinkedList();
        for (int i = 0; i < this.getSize(); i++) {
            clonedList.add(this.get(i));
        }
        return clonedList;
    }

    @Override
    public int getSize() {
        int counter = 0;
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            counter++;
            myLinkedList = myLinkedList.next;
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.getSize(); i++) {
            stringBuilder.append(this.get(i));
            if (i != getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
