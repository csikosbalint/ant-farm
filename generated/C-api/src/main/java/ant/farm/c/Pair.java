package ant.farm.c;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T16:11:34.648+01:00")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair(String name, String value) {
        setName(name);
        setValue(value);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (!isValidString(name)) return;

        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    private void setValue(String value) {
        if (!isValidString(value)) return;

        this.value = value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) return false;
        if (arg.trim().isEmpty()) return false;

        return true;
    }
}
