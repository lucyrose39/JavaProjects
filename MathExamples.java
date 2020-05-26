import java.util.Scanner;
public class MathExamples
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter a number or die!");
        int gg = scan.nextInt();
        System.out.println( (10/2) );
        System.out.println( (double)(10/4) );
        double x = 30.0;
        System.out.println( (x/10) );
        System.out.println((int)(36/6.0));
        System.out.println((20%6)); //% is to activate modulus (remainder)
        System.out.println("3%8"+(3%8));
        System.out.println("10%5"+(10%5));
        //System.out.println((10%0));
        //System.out.println((79806+60000));
    }
}