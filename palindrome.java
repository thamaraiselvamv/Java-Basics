//3.palindrome
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.next();
        System.out.print("Input an integer: ");
        int num = in.nextInt();

        if(isPalindromeStr(str)) {
            System.out.println(str + " is a palindrome string.");
        } else {
            System.out.println(str + " is not a palindrome string.");
        }

        if(isPalindromeInt(num)) {
            System.out.println(num + " is a palindrome integer.");
        } else {
            System.out.println(num + " is not a palindrome integer.");
        }
    }

    public static boolean isPalindromeStr(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean isPalindromeInt(int num) {
        int reversed = 0;
        int original = num;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}
