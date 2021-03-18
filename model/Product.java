package model;

import java.util.Objects;

public class Product {

    private String title;
    private double praise;
    private Double weight;
    private double weightPortionDay;
    private double percent;
    private Double weightMonth;

    public Product(String title, double percent) {
        this.title = title;
        this.percent = percent;
    }

    public double getPraise() {
        return praise;
    }

    public void setPraise(double praise) {
        this.praise = praise;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeightPortionDay() {
        return weightPortionDay;
    }

    public void setWeightPortionDay(double weightPortionDay) {
        this.weightPortionDay = weightPortionDay;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPraise(), getPraise()) == 0 &&
                Double.compare(product.getWeight(), getWeight()) == 0 &&
                Double.compare(product.weightPortionDay, weightPortionDay) == 0 &&
                title.equals(product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, getPraise(), getWeight(), weightPortionDay);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", praise=" + praise +
                ", weight=" + weight +
                ", weightPortionDay=" + weightPortionDay +
                '}';
    }
}
