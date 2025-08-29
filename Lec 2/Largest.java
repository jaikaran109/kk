// Largest among 3 number


import java.util.Scanner;
public class LargestL9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter inputs ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        int max = a;
        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        System.out.println("Maximum is :"+max);
    }
}
