//  _10b_Abstract_Class_Circle_SubClass  is a Concrete subclass representing a circle
class _10b_Abstract_Class_Circle_SubClass extends _10b_Abstract_Class_Shape_AbstractClass{
    private double radius;

    // Constructor
    public _10b_Abstract_Class_Circle_SubClass(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract methods
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
