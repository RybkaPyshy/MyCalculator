public class CalculateAlgorithms {

    public static double calcIfElse(double x, double y, String operation)
    {
        double result;

        if(operation.equals("+"))
            result = x + y;
        else if(operation.equals("-"))
            result = x - y;
        else if(operation.equals("*"))
            result = x * y;
        else if(operation.equals("/"))
            result = x / y;
        else
            throw new ArithmeticException("Not found selected type operation");

        return result;
    }

    public static double calcSwitchCase(double x, double y, String operation)
    {
        switch (operation)
        {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                throw new ArithmeticException("Not found selected type operation");
        }
    }
}
