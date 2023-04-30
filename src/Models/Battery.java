package Models;

public class Battery extends Instrument{
    private Integer drumsQuantity;
    private static final Integer DRUMSPRICE=3000;

    private Integer cymbalsQuantity;
    private static final Integer CYMBALSPRICE=2000;

    public Battery() {
    }

    public Battery(String brand, Integer drumsQuantity, Integer cymbalsQuantity) {
        super(brand,(double)((drumsQuantity*DRUMSPRICE)+(cymbalsQuantity*CYMBALSPRICE)));
        this.drumsQuantity = drumsQuantity;
        this.cymbalsQuantity = cymbalsQuantity;
    }

    public Integer getDrumsQuantity() {
        return drumsQuantity;
    }

    public Integer getCymbalsQuantity() {
        return cymbalsQuantity;
    }

    public void setDrumsQuantity(Integer drumsQuantity) {
        this.drumsQuantity = drumsQuantity;
    }

    public void setCymbalsQuantity(Integer cymbalsQuantity) {
        this.cymbalsQuantity = cymbalsQuantity;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "drumsQuantity=" + drumsQuantity +
                ", cymbalsQuantity=" + cymbalsQuantity +
                "} " + super.toString();
    }
}
