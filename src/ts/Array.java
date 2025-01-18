package ts;

import java.util.ArrayList;

public class Array implements Listable {

    ArrayList<Listable> array;

    public Array(ArrayList<Listable> array) {
        this.array = array;
    }

    public Array() {
        array = new ArrayList<>();
    }

    public void addToArray(Listable l) {
        array.add(l);
    }

    public ArrayList<Listable> getArray() {
        return array;
    }

    public void setArray(ArrayList<Listable> array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return ":array={" +
                  array +
                '}';
    }
}
