
import java.util.Scanner;


public class greatestAmong3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>b) && (a>c))
        {
            System.out.println(a+"greater");
        }
        else if((b>a) && (b>c))
        {
            System.out.println(b+"greater");
        }
        else if((c>a) && (c>b)){
            System.out.println(c+"greater");
        }
        else
            System.out.println("equales");
        
    }
    
}