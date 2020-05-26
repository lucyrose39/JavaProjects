import java.util.Scanner;
public class StringLab2
{
    public static void main (String [] args)
    {
        Scanner Haruka = new Scanner (System.in);
        System.out.println("enter date to convert in MM/DD/YYYY format");
        String date = Haruka.nextLine();
        System.out.print("your date in british format is ");
        System.out.println(date.substring(3,5)+"/"+(date.substring(0,2)+"/"+date.substring(6,10)));
        System.out.println("enter your name");
        String name = Haruka.nextLine();
        name.trim();
        String lstnme = name.substring(name.indexOf(" "));
        name.trim();
        String fstnme = name.substring(0, name.indexOf(" "));
        String namefinal = lstnme+", "+fstnme;
        namefinal = namefinal.trim();
        System.out.println(namefinal);
    }
}