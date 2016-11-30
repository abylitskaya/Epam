import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Boolean answerCorrect = true;

        System.out.println("Hello to Calculator!");
        System.out.println();

        while(true) {
            if (answerCorrect) {
                System.out.println("Please, enter expression.");
                String a = sc.next();
                String s = sc.next();
                String b = sc.next();

                Complex A = new Complex(a);
                Complex B = new Complex(b);

                calculator.execute(A, s, B);
            }

            System.out.println();
            System.out.println("Calculate one more expression? ('y' - yes, 'n - no)");
            String answer = sc.next();

            System.out.println();

            if (answer == "n") break;
            else if (answer == "y") continue;
            else answerCorrect = false;
        }

    }
}
