public class ScopingL4 {
    public static void main(String[] args) {
        int a = 90;
        int b = 80;
        String name = "Kunal";

        {
//             int a = 123; //already initialized outside the block in the same method,hence you cannot initialized again
            a = 21; //reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Rahul";
        System.out.println(name);
            //values initialized in the block , will remain in block
        }
        System.out.println("value is Changed "+a);
        System.out.println(name);
//      System.out.println(c) // cannot use outside the block
    }
}
