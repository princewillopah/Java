
// _10b_Abstract_Class_Rectangle_SubClass is a Concrete subclass representing a rectangle
class _10b_Abstract_Class_Rectangle_SubClass extends _10b_Abstract_Class_Shape_AbstractClass{

    private double width;
    private double height;

    // Constructor
    public _10b_Abstract_Class_Rectangle_SubClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of abstract methods
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}
