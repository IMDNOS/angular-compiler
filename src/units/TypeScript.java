package units;

import java.util.LinkedList;

public class TypeScript {

    LinkedList<Attribute> attributes = new LinkedList<>();
    LinkedList<Method> methods = new LinkedList<>();
    Method constructor;
//
    public TypeScript(LinkedList<Attribute> attributes, LinkedList<Method> methods, Method constructor) {
        this.attributes = attributes;
        this.methods = methods;
        this.constructor = constructor;
    }

    public LinkedList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(LinkedList<Attribute> attributes) {
        this.attributes = attributes;
    }

    public LinkedList<Method> getMethods() {
        return methods;
    }

    public void setMethods(LinkedList<Method> methods) {
        this.methods = methods;
    }

    public Method getConstructor() {
        return constructor;
    }

    public void setConstructor(Method constructor) {
        this.constructor = constructor;
    }

    @Override
    public String toString() {
        return "TypeScript{" +
                "attributes=" + attributes +
                ", methods=" + methods +
                ", constructor=" + constructor +
                '}';
    }
}
