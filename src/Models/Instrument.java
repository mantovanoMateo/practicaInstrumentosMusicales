package Models;

import java.util.Objects;

public abstract class Instrument {
    private String brand;
    private Double price;

    public Instrument() {
    }

    public Instrument(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instrument that)) return false;
        return Objects.equals(brand, that.brand) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}
