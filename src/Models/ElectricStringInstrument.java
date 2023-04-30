package Models;

import Interfaces.Amplifier;

public class ElectricStringInstrument extends StringInstrument implements Amplifier {
    private String model;

    public ElectricStringInstrument() {
    }

    public ElectricStringInstrument(String brand, Double price, Integer stringQuantity, String model) {
        super(brand, price, stringQuantity);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ElectricStringInstrument{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }

    @Override
    public String amplifiedSound() {
        return "(Electric String Instrument) : AMPLIFIED SOUND ";
    }
}
