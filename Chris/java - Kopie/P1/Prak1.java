import java.util.*;

class Prak1 
{


    public static void main(String args[])

    {
    
        int day  =Integer.parseInt(args[0]);

        int month=Integer.parseInt(args[1]);

        int year =Integer.parseInt(args[2]);
        
        int res;
        
        int days= day;

        switch (month)
        
            {
                case 12: days+=30;
                case 11: days+=31;
                case 10: days+=30;
                case  9: days+=31;
                case  8: days+=31;
                case  7: days+=30;
                case  6: days+=31;
                case  5: days+=30;
                case  4: days+=31;
                case  3: days+=28;
                case  2: days+=31;
                case  1: days+= 0;
            }
        
        res = (days+=((year-1900)*365 + (year-1900)/4))%7;
        
        switch (res)
            {
                case 0: System.out.printf("Sonntag\n"); break;
                case 1: System.out.printf("Montag\n"); break;
                case 2: System.out.printf("Dienstag\n"); break;
                case 3: System.out.printf("Mittwoch\n"); break;
                case 4: System.out.printf("Donnerstag\n"); break;
                case 5: System.out.printf("Freitag\n"); break;
                case 6: System.out.printf("Samstag\n"); break;
            }

    }
}

