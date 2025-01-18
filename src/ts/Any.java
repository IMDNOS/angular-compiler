package ts;

import java.util.ArrayList;
import java.util.Map;

public class Any extends Type{
    Listable anyType;



    public Any(Listable anyType) {
        this.anyType = anyType;
    }

    public Any() {
    }

    public Listable getAnyType() {
        return anyType;
    }

    public void setAnyType(Listable anyType) {
        this.anyType = anyType;
    }


    @Override
    public String toString() {
        return "\n any{" +
                "\n value=" + anyType +
                "\n }";
    }
}

