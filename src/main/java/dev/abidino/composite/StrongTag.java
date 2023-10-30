package dev.abidino.composite;

public class StrongTag extends TagObject {
    protected StrongTag() {
        super("<strong>", "</strong>");
    }

    @Override
    public void addValue(String value) {
        super.value = super.value + value;
    }
}
