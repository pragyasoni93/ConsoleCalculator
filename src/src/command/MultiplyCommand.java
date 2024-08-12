package command;

import service.Calculator;

public class MultiplyCommand implements Command{
    private final Calculator calculator;
    private final int x;
    private final int y;

    public MultiplyCommand(Calculator calculator, int x, int y) {
        this.calculator = calculator;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        calculator.multiply(x,y);
    }
}
