import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {
        //    Task_1
        System.out.println("TASK 1"+"\n");
        String GreetingOne = "Hi type number of months. ";
        String ExplainOne = "Where 0 - january, 11 - december:";
        System.out.println(GreetingOne + "\n" + ExplainOne);
        System.out.println("\n");
        Scanner MonthOne = new Scanner(System.in);
        int Month = MonthOne.nextInt();


        switch (Month) {
            case 0:
            case 1:
            case 2:
                System.out.println("Time of the year - Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Time of the year - Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Time of the year - Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Time of the year - Autumn");
                break;
            default:
                System.out.println("Be careful!!!");
        }

        //***
        // Есть ли возможность написать в операторе switch case условие равентства?
        // Типа
        // switch (Month){
        // case (Month>=2):
        // System.out.println("Time of the year - Winter");
        //***


    }
}
