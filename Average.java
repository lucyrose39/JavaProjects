import java.util.Scanner;
public class Average
{
    public static void main (String [] args)
    {
        Scanner scan=new Scanner (System.in);
        System.out.println("input first number");
        double num1 = scan.nextDouble();
        System.out.println("input second number");
        double num2 = scan.nextDouble();
        System.out.println("input third number");
        double num3 = scan.nextDouble();
        System.out.println(+((num1+num2+num3)/3));
        
    }
}