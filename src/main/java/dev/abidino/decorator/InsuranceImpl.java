package dev.abidino.decorator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InsuranceImpl implements Insurance {

    @Override
    public BigDecimal calculatePrice() {
        return BigDecimal.ZERO;
    }

    @Override
    public List<InsuranceItem> getInsuranceItems() {
        return new ArrayList<>();
    }

}
