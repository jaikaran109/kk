import java.util.Scanner;
public class NestedSwitchL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch(empID){
            case 1:
                System.out.println("Jai Karan ");
                break;
            
                case 2:
                    System.out.println("Anshika Singh ");
                    break;
                
                case 3:
                    System.out.println("Miss Roy  ");
                    break;

                case 4:
                    System.out.println("Emp Number 4");
                    switch(department){
                        case "IT":
                            System.out.println("IT Department");
                            break;
                        
                        case "Management":
                            System.out.println("Management Department ");
                            break;
                        
                        default:
                            System.out.println("No Department entered");
                    }
                    break;

                default:
                    System.out.println("Enter Correct empID ");
        }
    }
}
