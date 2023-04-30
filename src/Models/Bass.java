package Models;

public class Bass extends ElectricStringInstrument{
    public String typeOfPickups;

    public Bass(String brand, Double price, Integer stringQuantity, String model, String typeOfPickups) {
        super(brand, price, stringQuantity, model);
        this.typeOfPickups = typeOfPickups;
    }

    public Bass() {
    }

    public String getTypeOfPickups() {
        return typeOfPickups;
    }

    public void setTypeOfPickups(String typeOfPickups) {
        this.typeOfPickups = typeOfPickups;
    }

    @Override
    public String toString() {
        return "Bass{" +
                "typeOfPickups='" + typeOfPickups + '\'' +
                "} " + super.toString();
    }


}
