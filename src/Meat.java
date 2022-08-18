import java.time.LocalDate;

public class Meat extends Material{
    private double weight;
    @Override
    public double getAmount() {
        return getCost()*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate();
    }
}
