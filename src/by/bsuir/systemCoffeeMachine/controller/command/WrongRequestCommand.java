package by.bsuir.systemCoffeeMachine.controller.command;

import by.bsuir.systemCoffeeMachine.view.ViewFactory;
import by.bsuir.systemCoffeeMachine.view.ViewManager;

public class WrongRequestCommand implements Command {
    @Override
    public boolean execute(String[] args) {
        ViewFactory viewFactory = ViewFactory.getInstance();
        ViewManager viewManager = viewFactory.getViewManager();
        viewManager.showErrorMessage("Неправильная команда");
        return true;
    }
}

