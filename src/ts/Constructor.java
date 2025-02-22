package ts;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Constructor {
    Map<String,Listable> variables;


    public Constructor(Map<String,Listable> variables) {
        this.variables = variables;
    }

    public Constructor() {
        this.variables = new HashMap<>();
    }

    public Map<String,Listable> getVariables() {
        return variables;
    }

    public void setVariables(Map<String,Listable> variables) {
        this.variables = variables;
    }

    public void addVariable(String name, Type type) {
        this.variables.put(name, type);
    }

    @Override
    public String toString() {
        return "\n" +
                "variables:\n" + variables +
                '}';
    }
}
