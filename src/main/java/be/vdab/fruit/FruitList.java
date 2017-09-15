package be.vdab.fruit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitList {
    private List<Fruit> fruitLijst = new ArrayList<>();

    public FruitList() {
    }

    public void add(Fruit fruit) {
        fruitLijst.add(fruit);
    }

    public void sorteerVolgensPrijs() {
        Collections.sort(fruitLijst);

    }

    public void toon() {
        fruitLijst.stream().forEach(System.out::println);
    }

}
