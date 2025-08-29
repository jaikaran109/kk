//CALCULATOR


import java.util.Scanner;
public class CalculatorL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        //Take input from user until user does not press X or x

        while(true){
            //take the operator as input
            System.out.println("Enter the operators ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two number
                System.out.println("Enter two Numbers ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();


                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 !=0){
                    ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op == 'X' || op == 'x'){
                break;
            } else {
                System.out.println("Invalid operation !!");
            }
            System.out.println("The Answer is "+ans);
        
        }
    }
}
