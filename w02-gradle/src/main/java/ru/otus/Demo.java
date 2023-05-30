package ru.otus;
//главный класс для ДЗ
public class Demo {

    public static void main(String[] args) {

        // создаем коробку 1 - с Яблоками
        Box<Apple> box1 = new Box("Apple");
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        System.out.println("В коробке Box1 хранятся " + box1.getFruitName());
        System.out.println("Вес коробки 1: " + String.format("%.2f",box1.getWeight()) );


        // Создаем коробку  2 - с Апельсинами
        Box<Orange> box2 = new Box("Orange");
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println("В коробке Box2 хранятся " + box2.getFruitName());
        System.out.println("Вес коробки 2 " + String.format("%.2f",box2.getWeight()) );

        // Cравнение веса коробок
        System.out.println(" Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");
        System.out.println("------------------");

        //Перекладывание
        Box<Fruit> box3 = new Box<>("Fruits");
        box1.moveFruitsTo(box3);
        System.out.println("-- После удачной перекладки");
        System.out.println("Вес коробки 3 " + "("+ box3.getFruitName()+") "+String.format("%.2f",box3.getWeight()) );
        System.out.println("Вес коробки 1 " + "("+ box1.getFruitName()+") " + String.format("%.2f",box1.getWeight()) );

        System.out.println("--Неудачная попытка перекладки апельсины в яблоки поскольку разные типы - вес коробки не изменится");
        box2.moveFruitsTo(box1);
        System.out.println("Вес коробки 1 " + "("+ box1.getFruitName()+") " + String.format("%.2f",box1.getWeight()) );
        System.out.println("Вес коробки 2 " + "("+ box2.getFruitName()+") " + String.format("%.2f",box2.getWeight()) );

    }
}
