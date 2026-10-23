package se.iths.antonia.webshop.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TenPercentDiscountTest {
    @Test
    void calculatePrice() {
        Discount discount = new TenPercentDiscount();
        double result = discount.calculatePrice(200);
        assertEquals(180, result);
    }
}
