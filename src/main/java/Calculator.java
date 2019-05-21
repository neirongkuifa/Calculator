public class Calculator {

    private static Integer result = null;

    public static Integer getResult() {
        return result;
    }

    public static void setResult(Integer num) {
        result = num;
    }

    public static boolean addition(Integer arg1, Integer arg2) {
        if (arg1 != null && arg2 != null) {
            Calculator.result = arg1 + arg2;
            return true;
        } else {
            return false;
        }
    }

    public static boolean subtraction(Integer arg1, Integer arg2) {
        if (arg1 != null && arg2 != null) {
            Calculator.result = arg1 - arg2;
            return true;
        } else {
            return false;
        }
    }

    public static boolean multiplication(Integer arg1, Integer arg2) {
        if (arg1 != null && arg2 != null) {
            Calculator.result = arg1 * arg2;
            return true;
        } else {
            return false;
        }
    }

    public static boolean division(Integer arg1, Integer arg2) {
        if (arg1 != null && arg2 != null && arg2 != 0) {
            Calculator.result = arg1 / arg2;
            return true;
        } else {
            return false;
        }
    }

    public static boolean modulus(Integer arg1, Integer arg2) {
        if (arg1 != null && arg2 != null && arg2 != 0) {
            Calculator.result = arg1 % arg2;
            return true;
        } else {
            return false;
        }

    }
}
