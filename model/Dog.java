package model;


public class Dog extends Pet {


    public Dog(double weight, double percentWeight) {
        super(weight, percentWeight);

    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", percentWeight=" + percentWeight +
                '}';
    }
}
