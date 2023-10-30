package dev.abidino.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Wizard harryPotter = new WizardImpl();
        Magicable magicable = new MagicableImpl(harryPotter);
        magicable.doMagic();
    }
}
