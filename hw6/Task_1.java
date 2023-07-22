package hw6;


public class Task_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Персик", 3, 'm', 5.9);
        Cat cat2 = new Cat("Кнопка", 1, 'f', 3.2);

        cat1.eat();
        System.out.println(cat2.speak());
        cat1.aboutCat();
        cat2.aboutCat();

}
}