import java.util.Scanner;
public class ReviewCode
{
    public static void main (String [] args)
    {
        Scanner blake = new Scanner (System.in);
        System.out.println("enter your full name");
        String name = blake.nextLine();
        System.out.println("enter your age");
        int age = blake.nextInt();
        
        
        System.out.println("enter your weight");
        double weight = blake.nextDouble();
        
        Scanner kotoura = new Scanner (System.in);
        
        System.out.println("enter a random sentance");
        String sent = kotoura.nextLine();
        
        
        String namecap = (name.toUpperCase())+name.substring(0,4);
        System.out.println(namecap.substring(0,5)+(name.substring(5)));
        double moonweight = ((weight/9.81*1.622));
        System.out.println("your weight on the moon is "+moonweight);
        double marsweight = ((weight/9.81*3.711));
        double marsweightround = Math.round(marsweight);
        System.out.println("your weight on mars rounded is "+marsweightround);
        double dogyearage = (age/7);
        System.out.println("your age in dog years is "+dogyearage);
        int treats =(int)(Math.random()*1000+1);
        System.out.println("you would have eaten "+treats+" treats as a dog");
        System.out.println("enter a random letter");
        String let1 = kotoura.nextLine();
        char l1 =let1.charAt(0);
        System.out.println("enter another random letter");
        String let2 = kotoura.nextLine();
        char l2 = let2.charAt(0);
        System.out.println("your regular sentance: "+sent);
        //System.out.println("your other sentance: "+sent.replace(let1,let2));
        System.out.println("your regular sentance "+sent);
        sent = sent.replace(l1,'$');
        sent = sent.replace(l2,'%');
        sent = sent.replace('$',l2);
        sent = sent.replace('%',l1);
        System.out.println("your modified sentance "+sent);
    }
}