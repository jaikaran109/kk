import java.util.Scanner;
public class Functions_methodsL4 {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("The Sum is : "+sum);
    }
}
