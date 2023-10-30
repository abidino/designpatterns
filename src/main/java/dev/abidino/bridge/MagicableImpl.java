package dev.abidino.bridge;

public class MagicableImpl implements Magicable {

    private final Wizard wizard;

    public MagicableImpl(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public void doMagic() {
        wizard.expectoPatronum();
    }
}
