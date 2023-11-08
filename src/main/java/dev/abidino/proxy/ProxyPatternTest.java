package dev.abidino.proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        MatlabFactory matlabFactory = new MatlabFactory();

        for (int i = 0; i < 108; i++) {
            Matlab matlab = matlabFactory.createMatlab();
            matlab.calculate();
        }
    }
}
