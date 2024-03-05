public class _3Method_1_2 {

  //Static Method
  static void myMethod() {
    System.out.println("I just got executed!");
  }
  //Static Method with parameter
  static void myMethod2(String fname, int age) {
    System.out.println(fname + " Thomas");
  }



    public static void main(String[] args) {

        _2Method_2 myObj = new _2Method_2();
        _1Method_1 myObj2 = new _1Method_1();
        
        System.out.println("Hey "+myObj2.name+" the valu is "+myObj.x);
        myMethod();
        myMethod();

        myMethod2("Liam",5);
        myMethod2("Jenny",7);
        myMethod2("Anja",9);


      }
}
