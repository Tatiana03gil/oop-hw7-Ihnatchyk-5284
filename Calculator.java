import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    View view;
    Calculate calculate;
    private static Logger log = Logger.getLogger(Calculator.class.getName());

    public Calculator(View view, Calculate calculate) {

        this.view = view;
        this.calculate = calculate;
    }

    public void run() {

        try {
            FileHandler fh = new FileHandler("log.txt");
            log.addHandler(fh);
        } catch (SecurityException e) {
            log.log(Level.INFO, "Не удалось создать файл лога", e);
        } catch (IOException e) {
            log.log(Level.INFO,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода",
                    e);
        }

        double number = view.takeArgument();
        Argument argument1 = new Argument(number);
        String op = view.takeOpreator();
        Operator operator = new Operator(op);
        number = view.takeArgument();
        Argument argument2 = new Argument(number);

        switch (operator.getOperator()) {
            case "+":
                System.out.println(calculate.Add(argument1, argument2));
                log.log(Level.INFO, argument1.getArgument() + " + " + argument2.getArgument() + " = "
                        + calculate.Add(argument1, argument2));
                break;
            case "-":
                System.out.println(calculate.Subtract(argument1, argument2));
                log.log(Level.INFO, argument1.getArgument() + " - " + argument2.getArgument() + " = "
                        + calculate.Subtract(argument1, argument2));
                break;
            case "*":
                System.out.println(calculate.Multiply(argument1, argument2));
                log.log(Level.INFO, argument1.getArgument() + " * " + argument2.getArgument() + " = "
                        + calculate.Multiply(argument1, argument2));
                break;
            case "/":
                if (argument2.getArgument() != 0) {
                    System.out.println(calculate.Divide(argument1, argument2));
                    log.log(Level.INFO, argument1.getArgument() + " / " + " " + argument2.getArgument() + " = "
                            + calculate.Divide(argument1, argument2));
                } else
                    System.out.println("Нельзя делить на ноль");
                    log.log(Level.INFO, argument1.getArgument() + " / " + " " + argument2.getArgument() + " Ошибка! ");
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