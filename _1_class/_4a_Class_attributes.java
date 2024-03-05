public class _4a_Class_attributes {
    //" _4Classes_1" with two attributes: x1.x2,3 and name

    int x1 = 5;
    double x2 = 3.43;
    double x3;
    final int x4 = 10; // try to change this value will result in errors 
    String fname = "popo";
    String lname = "lola";
    int age = 24;

    public static void main(String[] args) {
        _4a_Class_attributes myObj = new _4a_Class_attributes();
        _4a_Class_attributes myObj2 = new _4a_Class_attributes();

        myObj.x2 = 45.7; //changed it value 
        myObj.x3 = 3.55; // assign a value 
        myObj2.x3 = 7.55;// assign a value 

        System.out.printf("from myObj x1 is %d. %n",myObj.x1);
        System.out.printf("from myObj2 x1 is %d. %n",myObj2.x1);
        System.out.println();

        System.out.printf("from myObj x2 is %.2f. %n",myObj.x2);
        System.out.printf("from myObj2 x2 is %.2f. %n",myObj2.x2);
        System.out.println();

        System.out.printf("from myObj x3 is %.3f. %n",myObj.x3);
        System.out.printf("from myObj2 x3 is %.2f. %n",myObj2.x3);
        System.out.println();

        System.out.printf("from myObj x4 is %d. %n",myObj.x4);
        System.out.printf("from myObj2 x4 is %d. %n",myObj2.x4);
        System.out.println();


        myObj2.fname = "Mo";
        myObj2.lname = "Po";
        myObj2.age = 12;

        System.out.printf("my names is %s %s and i am %d years old. %n",myObj.fname,myObj.lname,myObj.age); 
        System.out.printf("my names is %s %s and i am %d years old. %n",myObj2.fname,myObj2.lname,myObj2.age); 


      }


}