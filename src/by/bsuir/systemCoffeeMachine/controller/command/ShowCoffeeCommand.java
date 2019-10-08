package by.bsuir.systemCoffeeMachine.controller.command;

import by.bsuir.systemCoffeeMachine.service.DataManager;
import by.bsuir.systemCoffeeMachine.service.ServiceFactory;
import by.bsuir.systemCoffeeMachine.view.ViewFactory;
import by.bsuir.systemCoffeeMachine.view.ViewManager;

public class ShowCoffeeCommand implements Command {
    @Override
    public boolean execute(String[] args) {
        ViewFactory viewFactory = ViewFactory.getInstance();
        ViewManager viewManager = viewFactory.getViewManager();
        if (args.length == 1) {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            DataManager dataManager = serviceFactory.getDataManager();
            viewManager.showCoffeeList(dataManager.getCoffeeList());
        } else {
            viewManager.showErrorMessage("Неверные параметры");
        }
        return true;
    }
}
