// WAP to take input 2 numbers from the user and print the sum of the numbers.
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter a number : ");
        int num2 = sc.nextInt();
        int sum = num2 + num;
        System.out.println("The sum of two number is : "+sum);
    }

}
