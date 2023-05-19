package ru.otus;

//класс яблоко - идет от фрукта
public class Apple extends Fruit{
    public Apple(float weight) {
        super(weight);
    }
    public Apple() {
        super(1.3f);
    }
}