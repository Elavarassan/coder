import java.util.*;
class guvi2
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
         char c=s.next().charAt(0);
        if(Character.isLetter(c))        
        {
            System.out.print("yes");
            
        }
        else
        {
            System.out.print("No");
        }
    }
}
