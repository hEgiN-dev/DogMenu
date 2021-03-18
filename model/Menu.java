package model;

import java.util.List;

public class Menu {

    private List<Product> products;
    private double sumWeightProduct;

    public Menu(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getSumWeightProduct() {
        return sumWeightProduct;
    }

    public void setSumWeightProduct(double sumWeightProduct) {
        this.sumWeightProduct = sumWeightProduct;
    }
}
