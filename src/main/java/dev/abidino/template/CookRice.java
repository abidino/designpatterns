package dev.abidino.template;

public abstract class CookRice {

    public final void cook() {
        addWater();
        addRice();
        heat();
        System.out.println("Enjoy your meal");
    }

    protected abstract void heat();

    protected abstract void addRice();

    protected abstract void addWater();

}
