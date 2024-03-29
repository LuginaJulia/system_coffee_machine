package by.bsuir.systemCoffeeMachine.service.comparator.order;

import by.bsuir.systemCoffeeMachine.annotation.ComparatorInfo;
import by.bsuir.systemCoffeeMachine.service.order.Order;
import java.util.Comparator;

@ComparatorInfo(name = "По времени заказа",
        description = "Вначале с самой ранней датой")
public class OrderDateComparator implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        return order1.getDate().compareTo(order2.getDate());
    }
}

