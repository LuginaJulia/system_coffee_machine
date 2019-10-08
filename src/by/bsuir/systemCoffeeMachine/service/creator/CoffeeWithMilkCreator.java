package by.bsuir.systemCoffeeMachine.service.creator;

import by.bsuir.systemCoffeeMachine.service.coffee.CoffeeWithMilk;
import by.bsuir.systemCoffeeMachine.service.coffee.Espresso;

public class CoffeeWithMilkCreator implements Creator {
    @Override
    public Espresso createCoffee() {
        return new CoffeeWithMilk();
    }

    @Override
    public Class<? extends Espresso> getCoffeeClass() {
        return CoffeeWithMilk.class;
    }
}

