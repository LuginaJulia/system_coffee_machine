package by.bsuir.systemCoffeeMachine.service.creator;

import by.bsuir.systemCoffeeMachine.service.coffee.Espresso;

public interface Creator {
    Class<? extends Espresso> getCoffeeClass();
    Espresso createCoffee();
}
