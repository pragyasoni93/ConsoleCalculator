package command;

import service.Calculator;

public class DivideCommand implements Command{
    private final Calculator calculator;
    private final int x;
    private final int y;

    public DivideCommand(Calculator calculator, int x, int y) {
        this.calculator = calculator;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        calculator.divide(x,y);
    }
}
