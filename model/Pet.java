package model;

import java.util.Objects;

public abstract class Pet {

    protected Double weight;
    protected Double percentWeight;

    public Pet(Double weight, Double percentWeight) {
        this.weight = weight;
        this.percentWeight = percentWeight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPercentWeight() {
        return percentWeight;
    }

    public void setPercentWeight(Double percentWeight) {
        this.percentWeight = percentWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(getWeight(), pet.getWeight()) &&
                Objects.equals(getPercentWeight(), pet.getPercentWeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getPercentWeight());
    }
}
