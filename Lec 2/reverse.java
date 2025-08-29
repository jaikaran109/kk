//reverse a number


import java.util.Scanner;
public class ReverseL9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;

            rev = rev * 10 + rem ;

        }

        System.out.println(rev);
    }
}
