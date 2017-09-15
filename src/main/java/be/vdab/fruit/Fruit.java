package be.vdab.fruit;

public abstract class Fruit implements Comparable<Fruit> {

    // INSTANCE VARIABELEN
    private String naam;
    private double prijsPerKg;

    // CONSTRUCTOR met parameters
    public Fruit(String naam, double prijsPerKg) {
        this.naam = naam;
        this.prijsPerKg = prijsPerKg;
    }

    //GETTERS
    public String getNaam() {
        return naam;
    }

    public double getPrijsPerKg() {
        return prijsPerKg;
    }

    //SETTERS

//    public void setNaam(String naam) {
//        this.naam = naam;
//    }
//
//    public void setPrijsPerKg(double prijsPerKg) {
//        this.prijsPerKg = prijsPerKg;
//    }

    @Override
    public String toString() {
        return "Fruit{" +
                "naam='" + naam + '\'' +
                ", prijsPerKg=" + prijsPerKg +
                '}';
    }

    public int CompareTo(Fruit fruit) {
        return (int) (this.prijsPerKg - fruit.prijsPerKg);
    }


}
