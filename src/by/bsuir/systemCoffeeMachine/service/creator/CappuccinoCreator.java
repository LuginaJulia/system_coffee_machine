package by.bsuir.systemCoffeeMachine.service.creator;

import by.bsuir.systemCoffeeMachine.service.coffee.Cappuccino;
import by.bsuir.systemCoffeeMachine.service.coffee.Espresso;

public class CappuccinoCreator implements Creator {
    @Override
    public Espresso createCoffee() {
        return new Cappuccino();
    }

    @Override
    public Class<? extends Espresso> getCoffeeClass() {
        return Cappuccino.class;
    }
}
