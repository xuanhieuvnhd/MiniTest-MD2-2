import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    @Override
    public double getAmount() {
        return quantity*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate();
    }
}
