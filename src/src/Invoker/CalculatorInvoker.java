package Invoker;

import command.*;
import service.Calculator;

public class CalculatorInvoker {
    Command command;

    public void executeCmd(Calculator calculator, int x, int y, int operation){
        command = performAction(calculator, x, y, operation);
        command.execute();
    }

    private Command performAction(Calculator calculator, int x, int y, int operation){
        switch (operation){
            case 1 :
                return new AddCommand(calculator, x, y);
            case 2:
                return new SubtractCommand(calculator,x, y);
            case 3:
                return new MultiplyCommand(calculator, x, y);
            case 4:
                return new DivideCommand(calculator, x, y);
            case 5:
                System.exit(200);
            default:
                System.out.println();
                return null;
        }
    }
}
