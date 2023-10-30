package dev.abidino.composite;

public abstract class TagObject implements Tag {
    protected String openTag;
    protected String closeTag;

    protected String value;

    protected TagObject(String openTag, String closeTag) {
        this.openTag = openTag;
        this.closeTag = closeTag;
        this.value = "";
    }

    @Override
    public String toString() {
        return openTag + value + closeTag;
    }
}
