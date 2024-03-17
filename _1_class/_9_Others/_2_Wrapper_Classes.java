package _9_Others;

public class _2_Wrapper_Classes {

    public static void main(String args[]) {
        int num = 7; // primitive types
        Integer num1 = num; // this is autoboxing
        int num2 = num1; // this is auto-unboxing
        Integer x = 5; // boxes int to an Integer object
        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(x);

        String n = "12";
        int num3 = Integer.parseInt(n);
        System.out.println(n);
        System.out.println(num3*3);

    }
}
