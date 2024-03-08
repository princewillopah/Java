import calculator._1b_Advance_Calculator;

public class _1_Main {

    public static void main(String[] args) {

        _1b_Advance_Calculator obj = new _1b_Advance_Calculator();

        System.out.println(obj.add(4, 2)); // Inherited from _1a_Calculator
        System.out.println(obj.subtract(4, 2)); // Inherited from _1a_Calculator
        System.out.println(obj.mul(4, 2));
        System.out.println(obj.div(4, 2));
    }
}