//9/13
import java.util.Scanner;
public class MathClass
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int x = -6;
        int y = 49;
        double z = 25.634;
        //absolute value
        System.out.println("the absolute value of -6 is "+ Math.abs(x));
        System.out.println("the absolute value of -6 is "+ Math.abs(-61));
        System.out.println("Posiden quivers before him!");
        System.out.println("2 raised to the 3rd power is"+Math.pow(2,3));
        double answer = Math.pow(10,2);
        //square roots
        System.out.println("The square root of "+z+" is "+Math.sqrt(z));
        //rounding
        System.out.println("67.7 rounded is "+ Math.round(67.7));
        System.out.println("64.2 rounded is "+ Math.round(64.2));
        System.out.println("type somthing");
        int lapis = scan.nextInt();
    }
}