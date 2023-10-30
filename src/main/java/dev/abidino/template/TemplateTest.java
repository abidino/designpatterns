package dev.abidino.template;

public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("**** abidino rice recipe *******");
        CookRice abidinoCookRice = new AbidinoCookRice();
        abidinoCookRice.cook();

        System.out.println("*********************************");

        System.out.println("**** immino rice recipe *******");
        CookRice imminoCookRice = new ImminoCookRice();
        imminoCookRice.cook();
    }
}
