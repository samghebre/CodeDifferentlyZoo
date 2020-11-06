package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Camel extends AbstractAnimal {

    public Camel(String name) {

        super(name);
    }

    @Override
    public void doTrick() {
        AnimalTricks tricks1 = AnimalTricks.WALK;
        AnimalTricks tricks2 = AnimalTricks.RUN;
        String msg = String.format("My name is %s I am happy to %s and %s", name, tricks1.toString(), tricks2.toString());
        logger.info(msg);
    }
}