import java.util.Scanner;
public class StudentGradesINT
{
    public static void main (String [] args)
    {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter Name");
        String name=scan.nextLine();
        System.out.println("Enter Student Grade");
        int grade=scan.nextInt();
        System.out.println("Enter Bonus Points");
        int bonus=scan.nextInt();
        System.out.println("//////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("");
        System.out.println("== \tStudent Points \t==");
        System.out.println("");
        System.out.println("//////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Name \t\tLab \tBonus \tTotal");
        System.out.println("---- \t\t--- \t----- \t-----");
        System.out.println("Jibril \t\t81 \t10 \t"+(81+10));
        System.out.println("Sora \t\t100 \t25 \t"+(100+25));
        System.out.println("Shiro \t\t100 \t25 \t"+(100+25));
        System.out.println("Izuna \t\t78 \t5 \t"+(78+5));
        System.out.println(name+"\t\t"+grade+"\t"+bonus+"\t"+(grade+bonus));
        //System.out.println("Ino \t\t89 \t10 \t"+(89+10));
    }
}