import java.util.Scanner;
public class HeronsFormula
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("input length of side A");
        double SA = scan.nextInt();
        System.out.println("input length of side B");
        double SB = scan.nextInt();
        System.out.println("input length of side C");
        double SC = scan.nextInt();
        double perimiter = (SA+SB+SC);
        double S = ((perimiter)/2);
        double sol = Math.sqrt(S*(S-SA)*(S-SB)*(S-SC));
        System.out.println(sol);
    }
}