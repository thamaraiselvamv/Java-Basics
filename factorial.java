//4.factorial
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = in.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is " + factorial);
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
