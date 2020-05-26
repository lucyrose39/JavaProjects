import java.util.Scanner;
public class NetPay
{
    public static void main (String [] args)
{
    Scanner scan = new Scanner (System.in);
    double FEDERAL_TAX_PERCENT = 10.00;
    double STATE_TAX_PERCENT = 4.5;
    double SS_PERCENT = 6.2;
    double MEDICARE_PERCENT = 1.45;
    //double PAY_PER_HOUR_DEF = 7.25;
    System.out.println("how many hours do you work per week?");
    int HOURSPERWEEK = scan.nextInt();
    System.out.println("what do you get paid per hour?");
    double PAY_PER_HOUR = scan.nextDouble();
    int HOURS_PER_WEEK_DEF = 40;
    double grosspay = (HOURSPERWEEK*PAY_PER_HOUR);
    double federaltax = ((grosspay*FEDERAL_TAX_PERCENT)/100);
    double statetax = ((grosspay*STATE_TAX_PERCENT)/100);
    double socialsecurity = ((grosspay*SS_PERCENT)/100);
    double medicare = ((grosspay*MEDICARE_PERCENT)/100);
    double netpay = (grosspay-federaltax-statetax-medicare-socialsecurity);
    System.out.println("grosspay= $"+grosspay);
    System.out.println("federal tax= $"+federaltax);
    System.out.println("state tax= $"+statetax);
    System.out.println("social security= $"+socialsecurity);
    System.out.println("medicare= $"+medicare);
    System.out.println("netpay= $"+netpay);
}
}
