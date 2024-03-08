package _4_Inheritance_and_inner_class.Inheritance1;

public class Main_Inheritance {

    public static void main(String[] args) {

        C obj = new C();

        System.out.println(obj.add(4, 2)); // Inherited from _1a_Calculator
        System.out.println(obj.subtract(4, 2)); // Inherited from _1a_Calculator
        System.out.println(obj.mul(4, 2));  // Inherited from _1b_Advance_Calculator
        System.out.println(obj.div(4, 2));  // Inherited from _1b_Advance_Calculator
        System.out.println(obj.powr(4, 2));
    }

}
