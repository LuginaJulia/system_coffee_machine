package by.bsuir.systemCoffeeMachine.service.creator;

import by.bsuir.systemCoffeeMachine.service.coffee.Espresso;
import by.bsuir.systemCoffeeMachine.service.coffee.LatteMacchiato;

public class LatteMacchiatoCreator implements Creator {
    @Override
    public Espresso createCoffee() {
        return new LatteMacchiato();
    }

    @Override
    public Class<? extends Espresso> getCoffeeClass() {
        return LatteMacchiato.class;
    }
}
