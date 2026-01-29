import java.util.Scanner;

public class lab2{

    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        double num1,num2,m=1;

        System.out.println("Enter first number : ");
        num1=myobj.nextInt();

        System.out.println("Enter second number : ");
        num2=myobj.nextInt();

        m=num1*num2;
        System.out.println(m);




    }
}

