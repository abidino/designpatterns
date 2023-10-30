package dev.abidino.decorator;

import java.math.BigDecimal;
import java.util.List;

public interface Insurance {
    BigDecimal calculatePrice();

    List<InsuranceItem> getInsuranceItems();
}
