//Switch
// duplicate values not allowed
// break is use to terminate 
// break is use to terminate the sequence
// if break is not used, it will continue to next case
// default will excute at last


import java.util.Scanner;
public class SwitchL3 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    String fruit = input.next();

        switch(fruit){

            case "Mango":
                System.out.println("king of fruit");
                break;

            case "Apple":
                System.out.println("A sweet red fruit");
                break;

            case "Orange":
                System.out.println("Rount Fruit");
                break;

            case "Grapes":
                System.out.println("Small Fruit");
                break;

            default :
                System.out.println("please enter a valid fruit");
                
        }
    
    }
}






//in String if we use == then give error/false at some places when value is same of two string but they are pointing to diiferent objects
// String a = "jai"
// String b = "jai"   // here value is same but they are not pointing to same objects in some cases
// to ignore this we use 
// syntax = if(a.equals(b)){ . . . . . }
// Ex :- if(fruit.equals("mango")){
    //       System.out.println("King of fruits ");
    //      }
