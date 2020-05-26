import java.util.Scanner;
public class RandomExample
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        //System.out.println("start number generator? enter 1 for yes and n for no");
        //int val = scan.nextInt();
        System.out.println("here are some random #'s");
        System.out.println("a random number from 1 to 10: "); //multiple number = subtract than add one
        // 80 - 45 = 35 than add 1 = 36
        //since 45 is the start i need to write  + 45
        int x = (int)(Math.random()*10+1);
        int y = (int)(Math.random()*36+45);
        //System.out.println("a random number between 0 and 126"+int z = (int)(Math.random()*137);
        System.out.println("a random number from 5 to 27.99999");
        double z = (Math.random()*24+5);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("69.696969696969696969");
    }
}