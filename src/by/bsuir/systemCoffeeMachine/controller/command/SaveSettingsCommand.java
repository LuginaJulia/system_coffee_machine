package by.bsuir.systemCoffeeMachine.controller.command;

import by.bsuir.systemCoffeeMachine.service.DataManager;
import by.bsuir.systemCoffeeMachine.service.ServiceFactory;

public class SaveSettingsCommand implements Command {
    @Override
    public boolean execute(String[] args) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        DataManager dataManager = serviceFactory.getDataManager();

        dataManager.updateProfile();
        return true;
    }
}
