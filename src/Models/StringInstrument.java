package Models;

public class StringInstrument extends Instrument{
    private Integer stringQuantity;

    public StringInstrument() {
    }

    public StringInstrument(String brand, Double price, Integer stringQuantity) {
        super(brand, price);
        this.stringQuantity = stringQuantity;
    }

    public Integer getStringQuantity() {
        return stringQuantity;
    }

    public void setStringQuantity(Integer stringQuantity) {
        this.stringQuantity = stringQuantity;
    }

    @Override
    public String toString() {
        return "StringInstrument{" +
                "stringQuantity=" + stringQuantity +
                "} " + super.toString();
    }
}
