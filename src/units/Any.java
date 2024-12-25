package units;

import java.util.ArrayList;
import java.util.Map;

public class Any extends Type{
ArrayList<Listable> anyType;

    public Any(ArrayList<Listable> anyType) {
        this.anyType = anyType;
    }

    public void addAnyType(Listable l) {
        anyType.add(l);
    }

    public ArrayList<Listable> getAnyType() {
        return anyType;
    }

    public void setAnyType(ArrayList<Listable> anyType) {
        this.anyType = anyType;
    }

    @Override
    public String toString() {
        return "Any{" +
                "anyType=" + anyType +
                '}';
    }
}

class KeyValuePair implements Listable{

    Map<String , Type> keyValue;

    public KeyValuePair(Map<String, Type> keyValue) {
        this.keyValue = keyValue;
    }

    public Map<String, Type> getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(Map<String, Type> keyValue) {
        this.keyValue = keyValue;
    }
    @Override
    public String toString() {
        return "KeyValuePair{" +
                "keyValue=" + keyValue +
                '}';
    }

}
