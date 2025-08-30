import java.util.Arrays;
public class Variable_Length_ArgumentL4 {
    public static void main(String[] args) {
        multiple(31, 43,"jai","karan","Blaah blahh !");
        fun(12,32,435,43,5,34,1,35,5,65,3445);
        //output in the form of Array
    }
                    //String,char,int,etc
    static void fun(int ...v){   // when number of inputs is not define
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b,String ...v){  //variable length argument always comes in the end (we don't know length)
    // ...existing code...
    }
}
