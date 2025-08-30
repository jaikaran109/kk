import java.util.Scanner;
public class Days_SwitchL3 {
//Days of week
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector\n");
        System.out.println("Enter your day in number : ");
        int day = input.nextInt();
        // oldSwitch(day);
        newSwitch(day);
    }

    public static void newSwitch(int day){
        String dayStr = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid ";
        };
        System.out.println(dayStr);
    }
}



// Another  Method
// import java.util.Scanner;
// public class Days_Switch {
//     public static void oldSwitch(int day){
//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednessday");
//                 break;
//             case 4:
//                 System.out.println("thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid Day");
//                 break;
//         }
//     }
// }


