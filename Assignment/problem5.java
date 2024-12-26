// WAP to take input days from the user and convert it into years, months, and remaining days.
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days : ");
        int days = sc.nextInt();
        int yers = days / 365;
        int months = days/30;
        int remainingday = days % 365;
        System.out.println("Yeras : "+yers);
        System.out.println("Months : "+months);
        System.out.println("Remaining days : "+remainingday);

    }
}
