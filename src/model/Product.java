package model;

import java.time.LocalDate;

public class Product extends Material{
    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }
}
