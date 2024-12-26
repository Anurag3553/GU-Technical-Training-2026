// WAP to take input 3 digits numbers from the user and print sum of 1 and 3 digit.
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3-digit number : ");
        int number = sc.nextInt();
        int firstdigit  = number / 100;
        int thirddigit = number % 10;
        int sum = firstdigit + thirddigit;
        System.out.println("The sum of 1 and 3 digit is : "+sum);
    }
}
