import java.util.Scanner;
public class StringClass
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        String n1 = "winnie the pooh";
        String n2 = "Hakuna Matata";
        String n3 = "Jack the Ripper";
        // count the letters in a string
        int count = n1.length();
        System.out.println("there are "+count+" charecters in: "+n1);
        //given a position, tell me the letter
        //what is the 5th charecter?
        System.out.println(n2);
        System.out.println("the 5th character is "+n2.charAt(4));
        //jack the ripper
        //know where the word ripper starts? what position?
        System.out.println(n3);
        System.out.println("the word ripper begins at index "+n3.indexOf("Ripper"));
        //capitols make a difference
        //to switch every letter to capitol
        System.out.println(n2.toUpperCase());
        //to switch every letter to lower case
        System.out.println(n2.toLowerCase());
        //substring takes part of a sentance
        // substring(starting index, ending index+1);
        System.out.println(n1.substring(0,6)+" the "+n3.substring(9));
        //if you want all the way to the end just put the starting number
        //to check ABC order (alphanumerical order) -which word comes first
        String w1 = "apple";
        String w2 = "abby";
        String w3 = "app";
        String w4 = "abate";
        //if the first word comes before the second = negative
        //if the second word comes before the first = positive
        //if the same word = 0
        //capitol letters have priority
        System.out.println(w1+" and "+w4);
        System.out.println(w1.compareTo(w4));
        //does not always need to be a variable
        System.out.println(w2.toLowerCase().compareTo("abby"));
        //replace 1 letter for another
        String name="Scooby Doo";
        System.out.println( name.replace('o','a'));
        //replace d with p
        System.out.println(name.toLowerCase().replace('d','p'));
        // tells you true or false if the words are exactly the same
        String pw="password123";
        System.out.print("enter your password: ");
        String pass = scan.nextLine();
        System.out.println(pw.equals(pass));
        //put .equalsignorecase
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