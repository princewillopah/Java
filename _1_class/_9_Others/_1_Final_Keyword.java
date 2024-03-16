package _9_Others;
class A{
 int a = 20;
 final double pi = 4.34;
}
class B extends A{

    public double add(){
        return a + pi;
    }

    final public double add2(){
        return a * 2;
    }
}

final class C extends B{
    public double add(){
        return a + pi + 2;
    }
    // This class can not override the final method from his parent class
//    final public double add2(){
//        return a * 2;
//    }

}

// the below is an error also since a subclass can not inherit from a supper class that has the final keyword. That is, a final class can not be inherited by any class
// class D extends C{
//
// }
public class _1_Final_Keyword {
    public static void main(String[] args){
      var c = new C();
      System.out.printf("Answer is %.2f. %n",c.add());
     }

}
