//Distance formula sqrt of (x2-x1)^2+(y2+y1)^2
import java.util.Scanner;
public class distance
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("input a x coordinate");
        double x1 =scan.nextDouble();
        System.out.println("input a y coordinate");
        double y1 =scan.nextDouble();
        System.out.println("input a second x coordinate");
        double x2=scan.nextDouble();
        System.out.println("input a second y corrdinate");
        double y2=scan.nextDouble();
        System.out.println(+Math.sqrt((Math.pow(x2-x1,2)+((+Math.pow(y2-y1,2))))));
}
}