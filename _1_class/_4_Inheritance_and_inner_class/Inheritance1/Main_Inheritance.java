package _4_Inheritance_and_inner_class.Inheritance1;

public class Main_Inheritance {

    public static void main(String[] args) {

        C obj = new C();

        System.out.println(obj.add(4, 2)); //  B Inherited from A
        System.out.println(obj.subtract(4, 2)); // B Inherited from A
        System.out.println(obj.mul(4, 2));  // C Inherited from B
        System.out.println(obj.div(4, 2));  // C Inherited from B
        System.out.println(obj.powr(4, 2)); // this is from C
    }

}
