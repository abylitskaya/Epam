import static java.lang.System.exit;

public class Calculator {
    public void execute(Complex a, String s, Complex b) {
        Complex result;

        result = new Complex(0);

         switch (s) {
             case "+":
                 result = a.plus(b);
                 break;
             case "-":
                 result = a.minus(b);
                 break;
             case "/":
                 result = a.divides(b);
                 break;
             case "*":
                 result = a.times(b);
                 break;
             case "^":
                 result = a.degree(b);
                 break;
             case "root":
                 result = a.root(b);
                 break;
             case "%":
                 result = a.root(b);
                 break;
             default:
                 System.out.println("This operation is not supported!");
                 exit(1);
         }

        System.out.println(result.toString());
    }
}
