package Core;
// for GitHub test
class RightTriangle {
    private  double base;
    private  double height;

    public RightTriangle() {
    }

    public RightTriangle(double base, double height) {
        if (base <=0 || height <=0) {
            throw new IllegalArgumentException(" Base and height must be positive values.");
        }
        this.base = base;
        this.height = height;
    }

    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }
    public  double calculateArea() {
        return 0.5*base*height;
    }

}
