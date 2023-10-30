package dev.abidino.decorator;

import java.math.BigDecimal;

public class LivingCity extends InsuranceItem {

    private final String city;

    LivingCity(Insurance insurance, String city) {
        super(insurance);
        this.city = city;
    }

    @Override
    public BigDecimal calculatePrice() {
        if (city.equals("IST")) {
            return super.insurance.calculatePrice().add(BigDecimal.valueOf(20L));
        }
        return super.insurance.calculatePrice().add(BigDecimal.valueOf(10L));
    }

    @Override
    public String toString() {
        return "LivingCity{" +
                "city='" + city + '\'' +
                '}';
    }
}
