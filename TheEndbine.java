import java.util.Scanner;
public class TheEndbine
{
    public static void main (String [] args)
    {
        Scanner lava = new Scanner (System.in);
        System.out.println("please give me a word");
        String word = lava.nextLine();
        int wordnum = word.length();
        System.out.println("the last letter of your word is ");
        System.out.println(word.charAt(wordnum-1));
        
    }
}