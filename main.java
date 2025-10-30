import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any two numbers in the format of f1,op,f2:");
        float f1=sc.nextFloat();
        char op=sc.next().charAt(0);
        float f2=sc.nextFloat();

        if(op=='+')
            System.out.println("The sum is: "+(f1+f2));
        else if(op=='-')
            System.out.println("The difference is: "+(f1-f2));
        else if(op=='*')
            System.out.println("The product is: "+(f1*f2));
        else if(op=='/')
            System.out.println("The quotient is: "+(f1/f2));
        else
            System.out.println("Invalid operator");
            
    }
}