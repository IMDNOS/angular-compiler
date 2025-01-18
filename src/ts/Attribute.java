package ts;
public class Attribute implements ID{
    private String name;
    private Listable type;

    public Attribute(String name, Listable type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Listable getType() {
        return type;
    }
    public void setType(Listable type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "\n {" +
                "\n name='" + name + '\'' +
                ",\n  type=" + type +
                "\n}";
    }
}
