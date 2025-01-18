package ts;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Method {

    String name;
    Map<String,Listable> variables;


    public Method(String name) {
        this.name = name;
        variables = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Listable> getVariables() {
        return variables;
    }

    public void addVariable(String name,Listable v) {
        variables.put(name,v);
    }

    public void setVariables(Map<String, Listable> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                ", variables=" + variables +
                '}';
    }
}
