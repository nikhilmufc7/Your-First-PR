import java.util.*;
class Swap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value");
        int a=s.nextInt();
        System.out.println("enter the value");
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a="+a);
        System.out.println("the value of b="+b);
        s.close();
    
                        
    }
}