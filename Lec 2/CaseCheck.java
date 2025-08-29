//Check the case is upper or lower



import java.util.Scanner;
public class CaseCheckL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
                //trim remove all the spaces   //charAt(0) , here the 0 means the index where we are taking input
        
        if(ch >= 'a'  && ch <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
        System.out.println(ch);
    }
}
