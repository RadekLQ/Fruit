package be.vdab.fruit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FruitApp {
    final static org.slf4j.Logger logger = LoggerFactory.getLogger(FruitApp.class);

    public static Fruit[] fruitsoorten = new Fruit[]{
            new Citroen("Algave citroen", 3.0),
            new Sinaasappel("Jaffa appelsien", 3.2, true),
            new Sinaasappel("Bloedsappelsien", 3.4, true),
            new Pompelmoes("Roze pompelmoes", 3.1, "roze"),
            new Sinaasappel("Persappselsien", 2.5, false),
            new Pompelmoes("Rode pompelmoes", 3.3, "rood"),
            new Pompelmoes("Gele pompemmoes", 2.9, "wit")
    };

    public static void main(String[] args) {
        FruitList fruitList = new FruitList();

        logger.info("Entering application.");
        logger.trace("Entering application.");

        for (Fruit fruit : fruitsoorten) {
            fruitList.add(fruit);
        }
        fruitList.sorteerVolgensPrijs();
        fruitList.toon();

        //logger.debug("...");
        logger.info("Exiting application.");
        logger.trace("Exiting application.");
    }
}
