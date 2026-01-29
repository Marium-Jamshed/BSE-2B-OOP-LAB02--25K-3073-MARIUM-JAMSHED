import java.util.Scanner;

public class lab2{

    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        double num1,num2,m=1;
        double a,r,s,d;

        System.out.println("Enter first number : ");
        num1=myobj.nextInt();

        System.out.println("Enter second number : ");
        num2=myobj.nextInt();
        if(num2>0){
            d=num1/num2;
            System.out.println("The division is "+d);

        }
        else{
            System.out.println("division not possible");
        }

        m=num1*num2;
        a=num1+num2;
        s=num1-num2;
        r=num1%num2;
        System.out.println("The multipliaction is "+m);
        System.out.println("The addition is "+a);
        System.out.println("The subtraction is "+s);
        System.out.println("The remainder is "+r);

    }
}

