package _2_Class_Methods.static_methods;
class Calculator2{
    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
}
public class Static_Methods_example {
    public static void main(String args[]){
        System.out.println(Calculator2.add(20, 40));
        System.out.println(Calculator2.add(40, 50, 60));
    }
}
