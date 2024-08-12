package client;

import Invoker.CalculatorInvoker;
import service.Calculator;

import java.util.Scanner;

public class CalculatorClient {
    CalculatorInvoker cmdInvoker = new CalculatorInvoker();
    Calculator calculator = new Calculator();

    @SuppressWarnings("InfiniteLoopStatement")
    public void runCalculatorApp(){
        while(true) {
            showMenu();
            String userAction = getUserInput("Enter the operation to perform");
            int userInput2 = 0, userInput1=0;
            if(Integer.parseInt(userAction) < 5) {
                userInput1 = Integer.parseInt(getUserInput("Enter the first number : "));
                userInput2 = Integer.parseInt(getUserInput("Enter the second number : "));
            }
            cmdInvoker.executeCmd(calculator, userInput1, userInput2, Integer.parseInt(userAction));
        }
    }

    private void showMenu(){
        System.out.println("Welcome to the Calculator App!");
        System.out.println("Select the Operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.println();
    }

    private String getUserInput(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.next();
    }

}
