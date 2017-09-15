package be.vdab.fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FruitList {
    private List<Fruit> fruitLijst = new ArrayList<>();

    public FruitList() {
    }

    public void add(Fruit fruit) {
        fruitLijst.add(fruit);
    }


//    public void add() {
//        fruitLijst.stream().collect(Collectors.toList());
//    }

//    public void add() {
//        fruitLijst.addAll(Arrays.asList());
//    }

//    public void add() {
//        fruitLijst.addAll(fruitLijst.stream().collect(Collectors.toList()));
//    }

//    public void add() {
//        fruitLijst.addAll(new ArrayList<>(fruitLijst));
//    }

    public void sorteerVolgensPrijs() {
        Collections.sort(fruitLijst);
    }

    public void toon() {
        fruitLijst.stream().forEach(System.out::println);
    }
}
