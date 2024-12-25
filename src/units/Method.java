package units;

import java.util.LinkedList;

public class Method {
    LinkedList<ID> expressions;

    public Method(LinkedList<ID> expressions) {
        this.expressions = expressions;
    }

    public void addExpression(ID expression) {
        expressions.add(expression);
    }

    public LinkedList<ID> getExpressions() {
        return expressions;
    }

    public void setExpressions(LinkedList<ID> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "Method{" +
                "expressions=" + expressions +
                '}';
    }
}
