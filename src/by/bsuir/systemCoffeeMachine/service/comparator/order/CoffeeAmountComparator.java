package by.bsuir.systemCoffeeMachine.service.comparator.order;

import by.bsuir.systemCoffeeMachine.annotation.ComparatorInfo;
import by.bsuir.systemCoffeeMachine.service.order.Order;
import java.util.Comparator;

@ComparatorInfo(name = "По объему кофе",
        description = "Вначале с наименьшим объемом")
public class CoffeeAmountComparator implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        return order1.getCoffee().getCoffeeAmount() - order2.getCoffee().getCoffeeAmount();
    }
}
