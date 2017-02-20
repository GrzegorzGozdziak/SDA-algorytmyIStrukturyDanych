package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-18.
 */
public class LIFOQueue extends AbstractQueue {

    public LIFOQueue() {
    }

    public LIFOQueue(int value) {
        super(value);
    }

    @Override
    protected AbstractQueue getInstance() {
        return new LIFOQueue();
    }

    @Override
    protected AbstractQueue getInstance(int value) {
        return new LIFOQueue();
    }

    @Override
    public void push(int value) {
        AbstractQueue nextValue = this.next; //wskazanie na pierwszy element w kolejce
        LIFOQueue newValue = new LIFOQueue(value); //tworzymy nowy obiekt
        this.next = newValue; //zmienimy wskazanie głowy na nowy obiekt
        newValue.next = nextValue; //wskazanie nowego obiektu na obiekt ktory wczesniej wskazywala glowa
    }




}
