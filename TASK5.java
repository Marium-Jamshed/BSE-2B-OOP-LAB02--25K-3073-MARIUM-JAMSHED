import java.util.Scanner;

public class lab2{

    public static void main(String[] args) {
        int radius,diameter;
        int circumference;
        double per;
        Scanner myobj= new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius=myobj.nextInt();

        System.out.println("The circumference is "+2*3.14159*radius);
        System.out.println("The diameter is "+2*radius);
        System.out.println("The area is "+3.14159*radius*radius);




}}

