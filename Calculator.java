import java.lang.System.Logger;

public class Calculator {

    View view;
    Calculate calculate;

    public Calculator(View view, Calculate calculate) {
        this.view = view;
        this.calculate = calculate;
    }

    public void run() {
        double number = view.takeArgument();
        Argument argument1 = new Argument(number);
        String op = view.takeOpreator();
        Operator operator = new Operator(op);
        number = view.takeArgument();
        Argument argument2 = new Argument(number);

        switch (operator.getOperator()) {
            case "+":
                System.out.println(calculate.Add(argument1, argument2));
                break;
            case "-":
                System.out.println(calculate.Subtract(argument1, argument2));
                break;
            case "*":
                System.out.println(calculate.Multiply(argument1, argument2));
                break;
            case "/":
                if (argument2.getArgument() != 0)
                    System.out.println(calculate.Divide(argument1, argument2));
                else
                    System.out.println("Нельзя делить на ноль");
                break;
            default:
                System.out.println("Неверный оператор!");
        }

        int choice = view.Choice();
        do {
            switch (choice) {
                case 1:
                    run();
                    break;
            }
        } while (choice != 2);
    }   
}
