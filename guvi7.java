import java.util.*;
class guvi7
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int sum=0;
       int c[]=new int[a];
       for(int i=0;i<a;i++)
       {
           c[i]=sc.nextInt();
       }
       for(int i=0;i<b;i++)
       {
           sum=sum+c[i];
       }
       System.out.print(sum);
       
    }
}



