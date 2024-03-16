//-----------------------------------------------------------------------
// every constructor in java has a method(which may be invisible). this is the super() method. thus every constructor has a super() method
// the super() means "call the constructor of a super class"
//----------------------------------------------------------------------------
package _4_Inheritance_and_inner_class.inheritance2;

class A{
    public A(){// a constructor
//        super();
        System.out.println("x from A");
    }
    public A(int n){// a constructor
//        super();
        System.out.println(n+" from A");
    }
}

class B extends A{

    public B(){// this constructor will be called by the default object b
        super();
        System.out.println("x from B");
    }
    public B(int n){// overloading the constructor. this constructor will be called by the object b2
        super(n); // this will call the constuctor of a super class(in this case A) which has parameter
        System.out.println(n+" from B");
    }
}
public class Main {
    public static void main( String[] args){
        var b = new B();
        var b2 = new B(5);
    }
}
