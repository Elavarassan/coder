import java.util.*;
class guvi1
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
         String c=s.next();
        if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u"))
        {
            System.out.print("vowel");
            
        }
        else
        {
            System.out.print("consonant");
        }
    }
}
