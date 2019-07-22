import java.io.*;
import java.text.MessageFormat; 



public class P1
{

    public static void main(String args[]) 
    {
        int max = 10;
        int sum = 0;
        int sumMod3 = 0;
        int sumMod5 = 0;

        // int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        // int a;

        // for(int i=0; i<numbers.length; i++)
        //     {
        //         a = numbers[i]%5;
        //         System.out.println(a);
        //     }

        for (int i=0; i<max; i++)
        {
            if(i%3 == 0)
           {
             sumMod3 +=i;
             System.out.println(MessageFormat.format("{0} = {1} + {2}", +sumMod3 +sumMod3 +i));
           }
        
         if(i%5 == 0)
           {
             sumMod5 +=i;
           }
        
            sum = sumMod3+sumMod5;
        }
        System.out.println(sum);
    }   

} 