package dev.abidino.proxy;

public class MatlabProxy implements Matlab {
    private final Matlab matlab;
    private static int count = 0;

    public MatlabProxy(Matlab matlab) {
        this.matlab = matlab;
    }

    @Override
    public void calculate() {
        if (checkLicenseCount()) {
            matlab.calculate();
            increase();
            return;
        }
        throw new RuntimeException("You have filled your quota!");
    }

    private void increase() {
        count++;
        System.out.println(count);
    }

    private boolean checkLicenseCount() {
        return count < 100;
    }
}
