package Models;

public class AcousticStringInstrument extends StringInstrument{
    private String woodType;

    public AcousticStringInstrument() {
    }

    public AcousticStringInstrument(String brand, Double price, Integer stringQuantity, String woodType) {
        super(brand, price, stringQuantity);
        this.woodType = woodType;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    @Override
    public String toString() {
        return "AcousticStringInstrument{" +
                "woodType='" + woodType + '\'' +
                "} " + super.toString();
    }
}
