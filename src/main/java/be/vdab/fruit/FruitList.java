package be.vdab.fruit;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FruitList {
    private List<Fruit> fruitLijst;

    public FruitList() {
    }

    public void add() {
        fruitLijst.stream().collect(Collectors.toList());
    }

//    public void add() {
//        fruitLijst.addAll(fruitLijst.stream().collect(Collectors.toList()));
//
//    }

    public void sorteerVolgensPrijs() {
        Collections.sort(fruitLijst);
    }

    public void toon() {
        fruitLijst.stream().forEach(System.out::println);
    }
}
