import java.util.Scanner;

public class lab2{

    public static void main(String[] args){
            int marks=0,sum=0;
            double per;
            Scanner myobj= new Scanner(System.in);

            for(int i=0;i<=4;i++){
                System.out.println("Enter marks: ");
                marks=myobj.nextInt();
                sum+=marks;

            }
            System.out.println("Total marks is "+sum);
            per =sum/5;
            System.out.println("The percentage is "+per);

    }

}
