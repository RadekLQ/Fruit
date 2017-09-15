package be.vdab.fruit;

public class SinaasAppel extends Fruit {

    private boolean soort;

    public SinaasAppel(String naam, double prijsPerKg, boolean soort) {
        super(naam, prijsPerKg);
        this.soort = soort;
    }

    @Override
    public String toString() {
        return super.toString() +
                "soort=" + soort +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return 0;
    }
}
