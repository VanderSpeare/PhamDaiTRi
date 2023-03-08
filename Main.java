public class Circle{
    public double radius;
    public String color;

    public Circle(double radius,String color) {
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String toString() {
        return radius+" "+color+" ";
    }

    public class Cylinder extends Circle {
        public double height;
        public double volume;
        public Cylinder(double radius,String color,double height) {
            super(radius,color);
            this.height=height;
        }
        public double getHeight() {
            return this.height;
        }
        public void setHeight(double height) {
            this.height=height;
        }
        public double getVolume() {
            return getArea()*height;
        }
    }

}