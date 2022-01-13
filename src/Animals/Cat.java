package Animals;

public class Cat extends Animal {

    private String breed;

    public Cat(String name, String color, String weight, String breed) {
        super(name = "Mickey, ", color = "ginger, ", weight = "5kg, ");
        System.out.println("-Cat: " + name + color + weight + breed);
    }

    @Override
    public void sleeps() {System.out.println("sleeps: All day");
    }

    @Override
    public void eats() {System.out.println("eats: Fish");
    }

    @Override
    public void makesSound() {System.out.println("makes: meow");
    }
}
