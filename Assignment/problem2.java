// WAP to take input 1 number from the user and print its square and cube.
import java.util.Scanner;

public class problem2 {
    public static int square(int num){
        num = num * num;
        return num;
    }
    public static int cube(int num){
        num = num * num * num;
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The Square of "+num+" is : "+square(num) );
        System.out.println("The cube of "+num+" is : "+cube(num) );
    }
}
