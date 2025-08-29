import java.util.Scanner;
public class TypeCastingL8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //type casting 
        // int num = (int)(67.43f);
        // System.out.println(num);

        
        // int a = 257;
        // byte b = (byte)(a);  // 257 % 256 = 1   the maximum range of byte is 256


        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;  // firstly solve as a int then convert
        // System.out.println(d);


        // byte a = 23;
        // a = a * 2;   // not possible bcz its in byte


        // int number = 'a';
        // System.out.println(number);  //give ASCII values


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) + (d * s);
        //every value convert into there bigger one 
        System.out.println((f * b) + " " + (i / c) + " " +  (d * s));

        System.out.println(result);
    }
}
