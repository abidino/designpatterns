package dev.abidino.composite;

public class ParagraphTag extends TagObject {
    public ParagraphTag() {
        super("<p>", "</p>");
    }

    @Override
    public void addValue(String value) {
        super.value = super.value + value;
    }
}
