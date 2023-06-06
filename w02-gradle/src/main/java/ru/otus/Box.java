package ru.otus;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> products = new ArrayList<>();
    private String fruitName;

    public String getFruitName() {
        return fruitName;
    }

    public Box(String fruitName) {
        this.fruitName = fruitName;
    }

    public Box() {
    }

    public List<T> getProducts() {
        return products;
    }

    //  общий вес коробки - сумма всего что положат
    public double getWeight() {
        double sumWeightProducts = 0.0f;
        for (Fruit e : products) {
            sumWeightProducts += e.getWeight();
        }
        return sumWeightProducts;
    }

    // Добавление фрукта
    public void add(T fruit) {
        products.add(fruit);
    }

    // метод сравнения двух коробок по весу
    public boolean compare(Box other) {
        // Math.abs(f1 - f2) < THRESHOLD
        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
    }

    // метод позволяет достать из коробки 1 элемент (без привязки куда его затем класть)
    public void removeSingleItem() {

    }

    // перекладка
    public void moveFruitsTo(Box box2) {
        if ((box2.fruitName.equals(this.fruitName)) || box2.fruitName.equals("Fruits")) {
            for (int i = products.size() - 1; i >= 0; i--) {
                box2.getProducts().add(products.get(i));
                products.remove(i);
            }
        }

    }
}