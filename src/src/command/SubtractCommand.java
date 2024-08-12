package command;

import service.Calculator;

public class SubtractCommand implements Command{
    private final Calculator calculator;
    private final int x;
    private final int y;

    public SubtractCommand(Calculator calculator, int x, int y) {
        this.calculator = calculator;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        calculator.subtract(x,y);
    }
}
