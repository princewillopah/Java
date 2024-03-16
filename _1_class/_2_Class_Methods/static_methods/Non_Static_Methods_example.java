package _2_Class_Methods.static_methods;
class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
}
public class Non_Static_Methods_example {
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(20, 40));
        System.out.println(calculator.add(20.0, 40.0));
    }
}
