public class Calculate {
    
    Argument arg1;
    Argument arg2;

    public double Add (Argument arg1, Argument arg2) {
        return arg1.getArgument()+arg2.getArgument();
    }

    public double Subtract (Argument arg1, Argument arg2) {
        return arg1.getArgument()-arg2.getArgument();
    }

    public double Multiply (Argument arg1, Argument arg2) {
        return arg1.getArgument()*arg2.getArgument();
    }

    public double Divide (Argument arg1, Argument arg2) {
        return arg1.getArgument()/arg2.getArgument();
    }
}
