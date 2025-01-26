import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            try {
                int b = Integer.parseInt(args[1]);
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Div by zero error!");
            }

        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Need 2 parameters!");
        }

        try {
            nestedTry(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Need 2 parameters!");
        }
    }

    static void nestedTry(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Div by zero error");
        }
    }

}

class FinallyDemo {

    static void myMethod(int n) throws Exception {

        try {

            switch (n) {
                case 1:
                    System.out.println("1st case");
                    return;
                case 3:
                    System.out.println("3rd case");
                    throw new RuntimeException("3!");
                case 4:
                    System.out.println("4th case");
                    throw new Exception("4!");
                case 2:
                    System.out.println("2nd case");
            }

        } catch (RuntimeException e) {
            System.out.print("RuntimeException: ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try-block entered.");
        }
        
        
    }

}
