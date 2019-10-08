package by.bsuir.systemCoffeeMachine.service.creator;

import by.bsuir.systemCoffeeMachine.service.coffee.Americano;
import by.bsuir.systemCoffeeMachine.service.coffee.Espresso;

public class AmericanoCreator implements Creator {
    @Override
    public Espresso createCoffee() {
        return new Americano();
    }

    @Override
    public Class<? extends Espresso> getCoffeeClass() {
        return Americano.class;
    }
}

