
import java.util.Scanner;


public class FactorsOfNum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=(num/2);i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
    
}
