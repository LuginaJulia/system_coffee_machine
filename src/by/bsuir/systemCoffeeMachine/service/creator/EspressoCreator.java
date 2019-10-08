package by.bsuir.systemCoffeeMachine.service.creator;

import by.bsuir.systemCoffeeMachine.service.coffee.Espresso;

public class EspressoCreator implements Creator {
    @Override
    public Espresso createCoffee() {
        return new Espresso();
    }

    @Override
    public Class<? extends Espresso> getCoffeeClass() {
        return Espresso.class;
    }
}
