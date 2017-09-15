package be.vdab.fruit;

public class Pompelmoes extends Fruit {
    private String kleur;

    public Pompelmoes(String naam, double prijsPerKg, String kleur) {
        super(naam, prijsPerKg);
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return super.toString() +
                "kleur='" + kleur + '\'' +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return 0;
    }
}
