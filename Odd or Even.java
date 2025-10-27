import java.util.Scanner;
public class Odd or Even {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}