import java.util.Scanner;
public class main {
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
