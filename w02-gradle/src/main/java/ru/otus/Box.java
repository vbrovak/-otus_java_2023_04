package ru.otus;

import java.util.ArrayList;

public class Box {
     private ArrayList<Fruit> product = new ArrayList<>();
     static final String ERROR_MSG = "Ошибка ! Смешивать разные товары запрещено, используйте другой товар или коробку!";

    public Box() {
        ArrayList<Fruit> product = new ArrayList<>();
    }

    //  общий вес коробки - сумма всего что положат
    public double getWeight() {
           double sumWeightProducts = 0.0f;
        for (Fruit e : product) {
            sumWeightProducts += e.getWeight();
        }
        return sumWeightProducts;
    }

    public ArrayList<Fruit> getProduct() {
        return product;
    }

    // Добавление, с проверкой на тип
    public void add(Fruit fruit) {
        if (product.size() > 1) {
            if (isProductsFruitsComparable(fruit)) {
                throw new BoxException(ERROR_MSG);
            }
        }
        product.add(0, fruit);
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
    public void MoveFruitsTo(Box box2) throws BoxException {

        if (isProductsFruitsComparable(box2)) {
            throw new BoxException(ERROR_MSG);
        }
        for (int i = product.size() - 1; i >= 0; i--) {
            box2.getProduct().add(product.get(i));
            product.remove(i);
        }
    }

    public boolean isProductsFruitsComparable(Box otherBox) {
        return product.get(0).getClass() != otherBox.getProduct().get(0).getClass();
    }

    public boolean isProductsFruitsComparable(Fruit fruit) {
        return product.get(0).getClass() != fruit.getClass();
    }
}