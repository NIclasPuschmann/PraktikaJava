import java.io.*;
import java.text.MessageFormat; 



public class P1
{

    public static void main(String args[]) 
    {
        int max = 1000;
        int sum = 0;
        int sumMod3 = 0;
        int sumMod5 = 0;
        int subtract = 0;
        int loopCount = 0;

        // int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        // int a;

        // for(int i=0; i<numbers.length; i++)
        //     {
        //         a = numbers[i]%5;
        //         System.out.println(a);
        //     }

        for (int i=0; i<max; i++)
        {
            loopCount++;
            System.out.println(MessageFormat.format("\n{0}.LOOP", loopCount));

            if(i%3 == 0)
            {
                sumMod3 +=i;
                System.out.println(MessageFormat.format("1. {0} = {1} + {2}", sumMod3, sumMod3, i));
            }
        
            if(i%5 == 0)
            {
             sumMod5 +=i;
             System.out.println(MessageFormat.format("2. {0} = {1} + {2}", sumMod5, sumMod5, i));
            }
                  
            if(i%3 == 0 && i%5 == 0)
            {
                subtract +=i;
            }
        
            sum = sumMod3+sumMod5-subtract;
            System.out.println(MessageFormat.format("3. {0} = {1} + {2}", sum, sumMod3, sumMod5));
            


        }
        System.out.println("\nGesamtsumme "+sum);
    }   

} 