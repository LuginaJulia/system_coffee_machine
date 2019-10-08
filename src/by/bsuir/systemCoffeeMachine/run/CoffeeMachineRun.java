package by.bsuir.systemCoffeeMachine.run;

import by.bsuir.systemCoffeeMachine.controller.Controller;

public class CoffeeMachineRun {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}