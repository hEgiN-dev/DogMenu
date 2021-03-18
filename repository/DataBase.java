package repository;

import model.Product;
import model.WeekDays;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Product> products;


    public DataBase() {
        products = new ArrayList<>();

    }

    public List<Product> createGeneralLayoutProductDay() {
        products.add(new Product("Рубец", 17));
        products.add(new Product("Мясо", 40));
        products.add(new Product("Субпродукты", 10));
        products.add(new Product("Печень", 5));
        products.add(new Product("Кости", 15));
        products.add(new Product("Овощи,фрукты,ягоды", 13));
        return products;
    }

    public List<Product> createMenuWeek(WeekDays weekDays) {
        switch (weekDays) {
            case MONDAY:
                products.add(new Product("Рубец", 17));
                products.add(new Product("Индейка гуляш", 40));
                products.add(new Product("Желудок (индейка)", 10));
                products.add(new Product("Печень", 5));
                products.add(new Product("Шея (куриная)", 15));
                products.add(new Product("Овощи,фрукты,ягоды", 13));
                return products;
            case TUESDAY:
                products.add(new Product("Творог 5%", 27));
                products.add(new Product("Говяжья брюшина", 30));
                products.add(new Product("Почки гов.", 10));
                products.add(new Product("Печень", 5));
                products.add(new Product("Говяжий хвост", 15));
                products.add(new Product("Овощи,фрукты,ягоды", 13));
                return products;
            case WEDNESDAY:
                products.add(new Product("Рубец", 17));
                products.add(new Product("Баранина (брюшина)", 40));
                products.add(new Product("Желудок (индейка)", 10));
                products.add(new Product("Печень", 5));
                products.add(new Product("Остов куриный", 15));
                products.add(new Product("Овощи,фрукты,ягоды", 13));
                return products;
            case THURSDAY:
                products.add(new Product("Рубец", 17));
                products.add(new Product("Говяжья брюшина", 30));
                products.add(new Product("Сердце (говяжье)", 10));
                products.add(new Product("Печень", 5));
                products.add(new Product("Остов куриный", 15));
                products.add(new Product("Овощи,фрукты,ягоды", 13));
                return products;
            case FRIDAY:
                products.add(new Product("Творог 5%", 27));
                products.add(new Product("Индейка гуляш", 40));
                products.add(new Product("Сердце (говяжье)", 10));
                products.add(new Product("Шея (куриная)", 5));
                products.add(new Product("Овощи,фрукты,ягоды", 13));
                return products;
            case SATURDAY:
                products.add(new Product("Рубец", 17));
                products.add(new Product("Говядина обрезь", 50));
                products.add(new Product("Печень", 6));
                products.add(new Product("Говяжий хвост", 14));
                products.add(new Product("Овощи,фрукты,ягоды", 13));
                return products;
            case SUNDAY:
                products.add(new Product("Рубец", 17));
                products.add(new Product("Рыба", 60));
                products.add(new Product("Овощи,фрукты,ягоды", 13));
                return products;
            default:
                throw new IllegalStateException("Unexpected value: " + weekDays);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
