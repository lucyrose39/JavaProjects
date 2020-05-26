import java.util.Scanner;
public class Sphere
{
    public static void main (String [] args)
    {
        {
        Scanner scan=new Scanner (System.in);
        System.out.println("input radius");
        double rad=scan.nextDouble();
        System.out.println("surface area");
        System.out.println(4*(Math.PI)*(Math.pow(rad,2)));
        System.out.println("surface area rounded");
        System.out.println(Math.round((4*(Math.PI)*(Math.pow(rad,2)))));
        System.out.println("volume");
        System.out.println(1.33333*(Math.PI)*(Math.pow(rad,3)));
        System.out.println("volume rounded");
        System.out.println(Math.round(1.33333*(Math.PI)*(Math.pow(rad,3))));
    } 
    }
}