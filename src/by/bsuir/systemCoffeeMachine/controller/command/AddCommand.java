package by.bsuir.systemCoffeeMachine.controller.command;

import by.bsuir.systemCoffeeMachine.service.DataManager;
import by.bsuir.systemCoffeeMachine.service.ServiceFactory;
import by.bsuir.systemCoffeeMachine.view.ViewFactory;
import by.bsuir.systemCoffeeMachine.view.ViewManager;

public class AddCommand implements Command {
    @Override
    public boolean execute(String[] args) {
        ViewFactory viewFactory = ViewFactory.getInstance();
        ViewManager viewManager = viewFactory.getViewManager();
        if (args.length == 3) {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            DataManager dataManager = serviceFactory.getDataManager();

            switch (args[1]) {
                case "order":
                    try {
                        dataManager.createOrder(Integer.parseInt(args[2]) - 1);
                        viewManager.showMessage("Заказ успешно добавлен");
                    } catch (NumberFormatException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "profile":
                    dataManager.createProfile(args[2]);
                    viewManager.showMessage("Профиль успешно добавлен");
                    break;
                default:
                    viewManager.showErrorMessage("Неверные параметры");
            }
        } else {
            viewManager.showErrorMessage("Неверные параметры");
        }
        return true;
    }
}
