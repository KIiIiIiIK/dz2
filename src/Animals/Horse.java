package Animals;

public class Horse extends Animal {

    private String gender;

    public Horse(String name, String color, String weight, String gender) {
        super(name = "Jake, ", color = "brown, ", weight = "450kg, ");
        System.out.println("-Horse: " + name + color + weight + gender);
    }

    @Override
    public void sleeps() {System.out.println("sleeps: At night");
    }

    @Override
    public void eats() {System.out.println("eats: Oats and wheat");
    }

    @Override
    public void makesSound() {System.out.println("makes: neigh");
    }
}
