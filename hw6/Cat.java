package hw6;

public class Cat {
    static String family = "Коты";
    String name;
    int age;
    Character sex;
    double weight;

    public Cat(String name, int age, Character sex, double weight) { 
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Кот ест корм");
    }

    public String speak() {
        return "Мяу";
    }

    public void aboutCat() {
        if (age < 2) {
            System.out.printf("Это котенок %s, ему %d год(а), вес %.2f кг. \n", name, age, weight);
        } else {
            System.out.printf("Это взрослый кот %s, ему %d год(а), вес %.2f кг.\n", name, age, weight);
        }
    }
}