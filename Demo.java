import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        String name;
        int roll;
        float marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the roll number:");
        roll=sc.nextInt();
        System.out.println("Enter the marks:");
        marks=sc.nextFloat();
        System.out.println("The name is "+name);
        System.out.println("The roll number is "+roll);
        System.out.println("The marks obtained is "+marks);
    }
}