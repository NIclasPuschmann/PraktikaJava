import java.text.MessageFormat;

public class P2 
{
    public static void main(String args[])
    {
        int fn1=0, fn2=1, fn=0, i, max=4000000, loopCount=0, sum=0;

        
            // for(i = 0; i < max; i++)
            // {

            //         fn = fn1 + fn2;
            //         loopCount++;
            //         if(fn1 % 2 == 0 && fn1 < max)
            //         {
            //             sum += fn1;
            //         }
            //         fn1 = fn2;
            //         fn2 = fn;
            // } 
            // System.out.println(MessageFormat.format("{0}. {1}" ,loopCount, sum));
        

            do
            {   

                fn = fn1 + fn2;
                  loopCount++;
                if(fn1 % 2 == 0 && fn1 < max)
                {
                    sum += fn1;
                }
                fn1 = fn2;
                fn2 = fn;

            }   while (fn1 < max);

            System.out.println(MessageFormat.format("{0}. {1}" ,loopCount, sum));
        
    }
}