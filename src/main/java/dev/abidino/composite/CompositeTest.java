package dev.abidino.composite;

public class CompositeTest {

    public static void main(String[] args) {
        CompositeTag htmlTag = new HtmlTag();
        ParagraphTag paragraphTag = new ParagraphTag();
        paragraphTag.addValue("abidino");
        htmlTag.addTag(paragraphTag);
        System.out.println(htmlTag);
    }
}
