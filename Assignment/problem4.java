// WAP to take input rupees from the user and convert it into paise.
import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rupees : ");
        int rupee = sc.nextInt();
        int dollar = rupee/83;
        System.out.println(rupee+" rupees of "+dollar+" Dollar");
    }
}
