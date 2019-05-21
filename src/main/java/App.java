import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first argument:");
        Integer arg1;
        try {
            arg1 = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            arg1 = null;
        }
        System.out.println("Input your second argument:");
        Integer arg2;
        try {
            arg2 = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            arg2 = null;
        }
        System.out.println("Input the operator:");
        char op = scanner.next().charAt(0);
        scanner.close();
        int result = 0;
        boolean legal = true;
        switch (op) {
        case '+':
            if (Calculator.addition(arg1, arg2)) {
                result = Calculator.getResult();
                break;
            }
        case '-':
            if (Calculator.subtraction(arg1, arg2)) {
                result = Calculator.getResult();
                break;
            }
        case '*':
            if (Calculator.multiplication(arg1, arg2)) {
                result = Calculator.getResult();
                break;
            }
        case '/':
            if (Calculator.division(arg1, arg2)) {
                result = Calculator.getResult();
                break;
            }
        case '%':
            if (Calculator.modulus(arg1, arg2)) {
                result = Calculator.getResult();
                break;
            }
        default:
            legal = false;
            System.out.println("Unsupported Operations");

        }
        if (legal) {
            System.out.println("Result is: " + result);
        }
    }
}
