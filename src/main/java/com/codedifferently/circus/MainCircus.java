package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Camel;
import com.codedifferently.circus.animals.Parrot;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){

        this.animals = new ArrayList<>();
    }

    public void startTheShow(){

        logger.warn("You need to program the show. Let start the party! Woot Woot!");
        Bear bearReference = new Bear("Smokey");
        animals.add(bearReference);
        Camel camelReference1 = new Camel("Bob the camel");
        animals.add(camelReference1);
        Parrot parrotReference = new Parrot("Tom the parrot");
        animals.add(parrotReference);

    for(int i = 0; i < animals.size(); i++) {
        AbstractAnimal tempReference = animals.get(i);
        tempReference.doTrick();
    }

    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
