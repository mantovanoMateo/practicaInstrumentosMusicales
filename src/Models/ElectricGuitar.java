package Models;

import java.util.Objects;

public class ElectricGuitar extends ElectricStringInstrument{
    private Integer fretQuantity;

    public ElectricGuitar() {
    }

    public ElectricGuitar(String brand, Double price, Integer stringQuantity, String model, Integer fretQuantity) {
        super(brand, price, stringQuantity, model);
        this.fretQuantity = fretQuantity;
    }

    public Integer getFretQuantity() {
        return fretQuantity;
    }

    public void setFretQuantity(Integer fretQuantity) {
        this.fretQuantity = fretQuantity;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "fretQuantity=" + fretQuantity +
                "} " + super.toString();
    }

}
