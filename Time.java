import java.util.Scanner;
public class Time
{
    public static void main (String [] args)
    {
        Scanner scan=new Scanner (System.in);
        System.out.println("enter seconds");
        int time=scan.nextInt();
        int hr, min, sec;
        int leftover;
        hr=(int)(time/3600);
        leftover = (time%3600);
        min=(int)(leftover/60);
        leftover = (leftover%60);
        sec=(int)(leftover/1);
        System.out.println(hr+" hours");
        System.out.println(min+" minutes");
        System.out.println(sec+" seconds");
    }
}