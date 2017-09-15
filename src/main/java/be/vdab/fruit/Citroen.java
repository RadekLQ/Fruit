package be.vdab.fruit;

public class Citroen extends Fruit {

    public Citroen(String naam, double prijsPerKg) {
        super(naam, prijsPerKg);
    }

    @Override
    public int compareTo(Fruit fruit) {
        return 0;
    }
}
