import java.util.Scanner;
public class TheCombine
    {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter a random word");
        String word1 = scan.nextLine();
        System.out.println("enter another random word");
        String word2 = scan.nextLine();
        System.out.println("enter a third word");
        String word3 = scan.nextLine();
        System.out.println("enter a fourth word");
        String word4 = scan.nextLine();
        System.out.print("the acronym for your words is "+word1.charAt(0)+word2.charAt(0)+word3.charAt(0)+word4.charAt(0));
    }
}