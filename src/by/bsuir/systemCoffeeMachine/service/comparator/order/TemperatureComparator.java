package by.bsuir.systemCoffeeMachine.service.comparator.order;

import by.bsuir.systemCoffeeMachine.annotation.ComparatorInfo;
import by.bsuir.systemCoffeeMachine.service.order.Order;
import java.util.Comparator;

@ComparatorInfo(name = "По температуре",
        description = "Вначале с наименьшей температурой")
public class TemperatureComparator implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        return order1.getCoffee().getTemperature() - order2.getCoffee().getTemperature();
    }
}
