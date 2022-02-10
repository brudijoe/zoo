package vertebrate.mammal.monkey;
import vertebrate.mammal.Mammal;

public class Gorilla extends Mammal {

    public final String name;

    public Gorilla(Double weight, Double height, String color, String name) {
        super(weight, height, color);
        this.name = name;
    }

}
