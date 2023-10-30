package dev.abidino.decorator;

import java.math.BigDecimal;

public class CarAge extends InsuranceItem {

    private final int carAge;

    CarAge(Insurance insurance, int carAge) {
        super(insurance);
        this.carAge = carAge;
    }

    @Override
    public BigDecimal calculatePrice() {
        if (carAge >= 10) {
            return super.insurance.calculatePrice().add(BigDecimal.valueOf(10L));
        }
        return super.insurance.calculatePrice().add(BigDecimal.valueOf(40L));
    }

    @Override
    public String toString() {
        return "CarAge{" +
                "carAge=" + carAge +
                '}';
    }
}

