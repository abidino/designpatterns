package dev.abidino.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class InsuranceItem implements Insurance {
    protected Insurance insurance;
    protected final List<InsuranceItem> insuranceItems = new ArrayList<>();

    InsuranceItem(Insurance insurance) {
        this.insurance = insurance;
        insuranceItems.addAll(insurance.getInsuranceItems());
        insuranceItems.add(this);
    }

    @Override
    public List<InsuranceItem> getInsuranceItems() {
        return insuranceItems;
    }

}
