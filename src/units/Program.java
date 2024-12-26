package units;

public class Program {



    Html html;
    Css css;
    TypeScript typeScript;

//    public Program() {}

    public Program(Html html, Css css, TypeScript typeScript) {
        this.html = html;
        this.css = css;
        this.typeScript = typeScript;
    }

    public Html getHtml() {
        return html;
    }

    public void setHtml(Html html) {
        this.html = html;
    }

    public Css getCss() {
        return css;
    }

    public void setCss(Css css) {
        this.css = css;
    }

    public TypeScript getTypeScript() {
        return typeScript;
    }

    public void setTypeScript(TypeScript typeScript) {
        this.typeScript = typeScript;
    }

    @Override
    public String toString() {
        return "Program{" +
                "html=" + html +
                ", css=" + css +
                ", typeScript=" + typeScript +
                '}';
    }
}
