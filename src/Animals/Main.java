package Animals;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("name", "color", "weight", "stallion.");
        horse.sleeps();
        horse.eats();
        horse.makesSound();
        Cat cat = new Cat("name", "color", "weight", "Persian.");
        cat.sleeps();
        cat.eats();
        cat.makesSound();
        Koala koala = new Koala("name", "color", "weight", "Australia.");
        koala.sleeps();
        koala.eats();
        koala.makesSound();

        System.out.println("Koala equals Cat?: " + koala.equals(cat));
        System.out.println("Koala equals Horse?: " + koala.equals(horse));
        System.out.println("Cat equals Horse?: " + cat.equals(horse));
    }
}
