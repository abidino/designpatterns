package dev.abidino.proxy;

public class MatlabFactory {
    public Matlab createMatlab() {
        Matlab matlab = new MatlabImpl();
        return new MatlabProxy(matlab);
    }
}
