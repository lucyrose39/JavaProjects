public class RandomNumbers
{
    public static void main (String [] args)
    {
        int a=(int)(Math.random()*10);
        System.out.println("from 0 to 9: "+a);
        int b =(int)(Math.random()*10+1);
        System.out.println("from 1 to 10: "+b);
        int c=(int)(Math.random()*15+20);
        System.out.println("from 20 to 34: "+c);
        int d=(int)(Math.random()*20+(-10));
        System.out.println("from -10 to 9: "+d);
        double e=(double)(Math.random()*1);
        System.out.println("A random double between 0 and 1: "+e);
        int f=(int)(Math.random()*6+1);
        System.out.println("From 1 to 6: "+f);
    }
}