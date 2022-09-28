import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {

        //    Task_1
//
//        System.out.println("TASK 1" + "\n");
//        String GreetingOne = "Hi type number of months. ";
//        String ExplainOne = "Where 0 - january, 11 - december:";
//        System.out.println(GreetingOne + "\n" + ExplainOne);
//        System.out.println("\n");
//        Scanner MonthOne = new Scanner(System.in);
//        int MonthTask1 = MonthOne.nextInt();
//
//
//        switch (MonthTask1) {
//            case 0:
//            case 1:
//            case 11:
//                System.out.println("Time of the year - Winter");
//                break;
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("Time of the year - Spring");
//                break;
//            case 5:
//            case 6:
//            case 7:
//                System.out.println("Time of the year - Summer");
//                break;
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("Time of the year - Autumn");
//                break;
//            default:
//                System.out.println("Be careful!!!");
//        }

//        ***
//         Есть ли возможность написать в операторе switch case условие равентства?
//         Типа
//         switch (Month){
//         case (Month>=2):
//         System.out.println("Time of the year - Winter");
//        ***


        //    Task_2

//        System.out.println("TASK 2" + "\n");
//        String GreetingTwo = "Hi type number of months. ";
//        String ExplainTwo = "Where 0 - january, 11 - december:";
//        System.out.println(GreetingTwo + "\n" + ExplainTwo);
//        System.out.println("\n");
//        Scanner MonthTwo = new Scanner(System.in);
//        int MonthTaskTwo = MonthTwo.nextInt();
//        if (MonthTaskTwo <= 1 || MonthTaskTwo == 11) {
//            System.out.println("Time of the year - Winter");
//        } else if (MonthTaskTwo <= 4) {
//            System.out.println("Time of the year - Spring");
//        } else if (MonthTaskTwo <= 7) {
//            System.out.println("Time of the year - Summer");
//        } else if (MonthTaskTwo <= 10) {
//            System.out.println("Time of the year - Autumn");
//        } else {
//            System.out.println("We haven't this month in condition");
//        }

//            Task_3

//        System.out.println("TASK 3" + "\n");
//        System.out.println("Hi write outside degree: ");
//        System.out.println("\n");
//        Scanner Degree = new Scanner(System.in);
//        int T = Degree.nextInt();
//
//        System.out.println("Temperature :" + T);
//        if (T > -5) {
//            System.out.println("Warm");
//        } else if (T <= -5 && T > -20) {
//            System.out.println("Normal");
//        } else if (T <= -20) {
//            System.out.println("Freeze");
//        }

//            Task_4

//        System.out.println("TASK 4" + "\n");
//        String Type = "Type color of rainbow: ";
//        System.out.println(Type);
//        System.out.println("1 - Red;\n2 - Orange;\n3 - Yellow;\n4 - Green;\n5 - Blue;\n6 - Indigo;\n7 - Violet;");
//        Scanner RainBow = new Scanner(System.in);
//        System.out.println("Write number: ");
//        int RB = RainBow.nextInt();
//        switch (RB) {
//            case (1):
//                System.out.println(Type + "Red");
//                break;
//            case (2):
//                System.out.println(Type + "Orange");
//                break;
//            case (3):
//                System.out.println(Type + "Yellow");
//                break;
//            case (4):
//                System.out.println(Type + "Green");
//                break;
//            case (5):
//                System.out.println(Type + "Blue");
//                break;
//            case (6):
//                System.out.println(Type + "Indigo");
//                break;
//            case (7):
//                System.out.println(Type + "Violet");
//                break;
//            default:
//                System.out.println("Read conditions!");

//            Task_5

//                System.out.println("TASK 5" + "\n");
//                for (int iFive = 0; iFive <= 99; iFive++) {
//                    if (iFive % 2 == 0 && iFive != 0) {
//                        System.out.println(iFive);
//                    } else {
//
//                    }
//                }

//            Task_6

//                System.out.println("TASK 6" + "\n");
//                for (int iSix = 5; iSix >= 1; iSix--) {
//                    System.out.println(iSix);
//                }

//            Task_7

//                System.out.println("TASK 7" + "\n");
//                System.out.println("Write integer data: ");
//                Scanner DataSeven = new Scanner(System.in);
//                int DataTaskSeven = DataSeven.nextInt();
//                int Summ = 0;
//                int SecondPart = DataTaskSeven;
//                for (; DataTaskSeven > 0; DataTaskSeven /= 10) {
//                    System.out.println(DataTaskSeven % 10);
//                    Summ += DataTaskSeven % 10;
//                }
//                System.out.println("Summa separate data: " + Summ);
//                System.out.println("SECOND PART:");
//                for (int iSeven = 1; iSeven <= SecondPart; iSeven++) {
//                    System.out.println(iSeven);
//                }

//                    Task_8

//                System.out.println("TASK 8" + "\n");
//                int DataEight = 1;
//                while (DataEight < 15) {
//                    System.out.println("Multiplication: " + DataEight * 7);
//                    DataEight++;
//                }
//
//                //            Task_9
//
//                System.out.println("TASK 9" + "\n");
//                int aNine = 0;
//                int bNine = 0;
//                while (bNine < 10) {
//                    bNine++;
//                    aNine -= 5;
//                    System.out.println("Data: " + aNine);
//                }
//        ***
//        Почему отчёт идёт с -5, а не с 0?
//        ***

//                //            Task_10
//                System.out.println("TASK 10" + "\n");
//                int SummTen = 0;
//
//                for (int Iten = 10; Iten <= 20; Iten++) {
//                    SummTen = Iten * Iten;
//                    System.out.println("Data of square: " + SummTen);
//                }

//        ***
//        Как пользоваться командой Square, что бы не писать число умножить на число?
//        ***
        }
    }


