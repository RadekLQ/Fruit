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

//    public double CompareTo(Fruit fruit) {
//        return this.prijsPerKg - fruit.prijsPerKg;
//    }

    public double CompareTo(Fruit f1, Fruit f2) {
        return f1.prijsPerKg - f2.prijsPerKg;
    }




}
