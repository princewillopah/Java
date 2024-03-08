//package _3_Packages.calculator;

import _3_Packages.calculator._1c_Advance_Scientific_Calc;

public class _1_Main_calc {

    public static void main(String[] args) {

        _1c_Advance_Scientific_Calc obj = new _1c_Advance_Scientific_Calc();

        System.out.println(obj.add(4, 2)); // Inherited from _1a_Calculator
        System.out.println(obj.subtract(4, 2)); // Inherited from _1a_Calculator
        System.out.println(obj.mul(4, 2));  // Inherited from _1b_Advance_Calculator
        System.out.println(obj.div(4, 2));  // Inherited from _1b_Advance_Calculator
        System.out.println(obj.powr(4, 2));
    }
}