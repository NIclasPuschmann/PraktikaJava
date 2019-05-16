import java.io.*;

class prak1 {

    public static void main(String args[])

    {

        System.out.println("Bitte geben Sie ein Datum nach dem 1.1.1900 ein!\n");
        System.out.println("Lassen Sie zwischen Tag Monat Jahr ein Leerzeichen\n");


        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        int tagGes = 0;
        int tageDerVollstMonate[] = { 0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };

        System.out.printf("Das Datum, dass Sie eingegeben haben ist der: %d.%d.%d\n", day, month, year);

        tagGes = ((year-1900)*365 + (year-1900)/4 + tageDerVollstMonate[month] + day )%7;

        switch(tagGes) {

            case 0: System.out.printf("Der %d.%d.%d war ein Sonntag\n", day, month, year);
                    break;
            case 1: System.out.printf("Der %d.%d.%d war ein Montag\n", day, month, year);
                    break; 
            case 2: System.out.printf("Der %d.%d.%d war ein Dienstag\n", day, month, year);
                    break;
            case 3: System.out.printf("Der %d.%d.%d war ein Mittwoch\n", day, month, year);
                    break; 
            case 4: System.out.printf("Der %d.%d.%d war ein Donnerstag\n", day, month, year);
                    break;
            case 5: System.out.printf("Der %d.%d.%d war ein Freitag\n", day, month, year);
                    break; 
            case 6: System.out.printf("Der %d.%d.%d war ein Samstag\n", day, month, year);
                    break;

        }
    }
}