package Animals;

public class Koala extends Animal {

    private String origin;

    public Koala(String name, String color, String weight, String origin) {
        super(name = "Nancy, ", color = "grey, ", weight = "10kg, ");
        System.out.println("-Koala: "+ name + color + weight + origin);
    }

    @Override
    public void sleeps() {System.out.println("sleeps: Whenever");
    }

    @Override
    public void eats() {System.out.println("eats: Eucalyptus");
    }

    @Override
    public void makesSound() {System.out.println("makes: squeal");
    }
}
