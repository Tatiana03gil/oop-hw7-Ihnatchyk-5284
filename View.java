import java.util.Scanner;

public class View {
    
    Scanner scanner = new Scanner(System.in);

    public double takeArgument () {
        System.out.println("Введите число: ");
        return scanner.nextDouble();
    }

    public String takeOpreator () {
        System.out.println("Введите оператор: ");
        return scanner.next();
    }

    public int Choice () {
        System.out.println("Чтобы продолжить, нажмите 1, чтобы закрыть калькулятор, нажмите 2");
        return scanner.nextInt();
    }
}
