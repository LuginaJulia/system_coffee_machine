package by.bsuir.systemCoffeeMachine.controller;

import by.bsuir.systemCoffeeMachine.controller.command.Command;

import java.util.Scanner;

/**
 * Класс-контроллер, используемый для получения запроса пользователя и передачи его на уровень сервисов.
 */
public class Controller {
    /**
     * Метод, осуществляющий считывание команды пользователя из консоли, поиска необходимых действий и их выполнение.
     * Выполняется, пока не будет получения команда выхода.
     */
    public void start() {
        Scanner in = new Scanner(System.in);
        CommandProvider provider = new CommandProvider();
        boolean isContinue;
        do {
            String commandString = in.nextLine();
            String[] args = commandString.split(" ");
            Command command = provider.getCommand(args);
            isContinue = command.execute(args);
        } while (isContinue);
    }
}