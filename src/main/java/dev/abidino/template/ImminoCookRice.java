package dev.abidino.template;

public class ImminoCookRice extends CookRice {
    @Override
    protected void heat() {
        int cookingTime = 15;
        System.out.println("rice is heat for " + cookingTime + " minutes.");
    }

    @Override
    protected void addRice() {
        int cupOfRice = 3;
        System.out.println(cupOfRice + " cup of rice is adding to saucepan ");
    }

    @Override
    protected void addWater() {
        int cupOfWater = 6;
        System.out.println(cupOfWater + " cup of water is adding to saucepan ");
    }
}
