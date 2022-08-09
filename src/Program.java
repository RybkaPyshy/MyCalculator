import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Program {

    public static void main(String[] args) throws IOException
    {
        out.println("Welcome to my super Calculator, you can use the next operations: +, -, *, /");

        var br = new BufferedReader(new InputStreamReader(System.in));

        out.print("print Y: ");
        var y = br.readLine();

        out.print("print X: ");
        var x = br.readLine();

        out.print("print operation: ");
        var operation = br.readLine();

        var result = CalculateAlgorithms.calcIfElse(Integer.parseInt(y), Integer.parseInt(x), operation);
        out.println("calculate result from IfElse algorithm: " + result);

        result = CalculateAlgorithms.calcSwitchCase(Integer.parseInt(y), Integer.parseInt(x), operation);
        out.println("calculate result from SwitchCase algorithm: " + result);

        out.println("Good luck");
    }
}
