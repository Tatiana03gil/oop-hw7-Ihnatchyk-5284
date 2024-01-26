
public class Main {
    
    public static void main(String[] args) {
        View view = new View();
        Calculate calculate = new Calculate();

        Calculator calculator = new Calculator(view, calculate);

        calculator.run();
    }
}


