package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Parrot extends AbstractAnimal {

    public Parrot(String name) {

        super(name);
    }

    @Override
    public void doTrick() {
        AnimalTricks tricks1 = AnimalTricks.EAT;
        AnimalTricks tricks2 = AnimalTricks.TALK;
        String msg = String.format("My name is %s I am happy to %s and %s", name, tricks1.toString(), tricks2.toString());
        logger.info(msg);
    }
}