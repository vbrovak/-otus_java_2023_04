package ru.otus;
//главный класс для ДЗ
public class Demo {

    public static void main(String[] args) {
        System.out.println("Будет три коробки - первая и третья с яюлоками, вторая с апельсинами");
        System.out.println("--------------------------------------------------------------------");
        // создаем коробку 1 - с Апельсинами
        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        System.out.println("В коробке Box1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Вес коробки 1: " + box1.getWeight());

        // Создаем коробку  2 - с Яблоками
        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println("В коробке Box2 хранятся " + box2.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Вес коробки 2 (яблоки): " + box2.getWeight());

        // Cравнение веса
        System.out.println(" Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");
        System.out.println("------------------");

        // создаем дополнительно еще одну коробку с яблоками для опытом с перекладкой
        Box box3 = new Box();
        //кладем в нее 2 яблока
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println("В коробке Box3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());
        System.out.println("Вес коробки №3: " + box3.getWeight());

        System.out.println("-----Яблоки к яблокам-------------");
        // пересыпаем яблоки из коробки 1 в коробку 3, яблоки к яблокам, ошибки не должно быть, но для красоты
        try {
            box1.MoveFruitsTo(box3);
        } catch (BoxException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3 после пересыпания: " + box3.getWeight());
        System.out.println("Вес коробки №1 после пересыпания: " + box1.getWeight());

        System.out.println("-----Апельсины к яблокам (пересыпание из 2ой в 3ю)-------------");
        try {
            box2.MoveFruitsTo(box3);
        } catch (BoxException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №2: " + box2.getWeight());

        System.out.println("-----Апельсины к яблокам (добавление вручную в 3ую коробку)-------------");
            try {
            box3.add(new Orange());
        } catch (BoxException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());

    }
}
