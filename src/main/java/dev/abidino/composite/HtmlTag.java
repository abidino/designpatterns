package dev.abidino.composite;

public class HtmlTag extends TagObject implements CompositeTag {

    public HtmlTag() {
        super("<htlm5>", "</html5>");
    }

    @Override
    public void addTag(Tag tag) {
        super.value = super.value + tag.toString();
    }

    @Override
    public void addValue(String value) {
        super.value = super.value + value;
    }
}
