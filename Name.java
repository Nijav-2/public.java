import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        System.out.println("Enter your name and age:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        System.out.println("Your name is "+name+" and age is "+age);
    }
}
