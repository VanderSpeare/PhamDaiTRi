public class Circle{
    public double radius;
    public String color;

   import java.util.Scanner;
    public class Shape {
        public String color="red";
        public boolean filled;
        public Shape() {}
        public Shape(String color,boolean filled) {
            this.color=color;
            this.filled=filled;
        }
        public String getColor() {
            return this.color;
        }
        public void setColor(String color) {
            this.color=color;
        }
        public boolean isFilled() {
            return this.filled=filled;
        }
        public void setFilled(boolean filled) {
            this.filled=filled;
        }

        @Override
        public String toString() {
            return "Shape{" + "color=" + color + ", filled=" + filled + '}';
        }

        public class Circle extends Shape{
            public double radius=1.0;
            public Circle() {
            }

            public double getRadius() {
                return radius;
            }

            public void setRadius(double radius) {
                this.radius = radius;
            }

            public Circle(double radius) {
            }
            public Circle(double radius,String color,boolean filled) {
                super(color,filled);
            }
            public double getArea() {
                return radius*radius*Math.PI;
            }
            public double getPerimeter() {
                return 2*radius*Math.PI;
            }
            public void  setPerimeter(double radius) {
                this.radius=radius;
            }
            @Override
            public String toString() {
                return "Circle{" + "radius=" + radius + '}';
            }
        }
    }

    public class Rectangle extends Shape {
        public double width=1.0;
        public double length=1.0;
        public Rectangle() {}
        public Rectangle(double width,double length) {
            this.width=width;
            this.length=length;
        }
        public Rectangle(double width,double length,String color,boolean filled) {
            super(color,filled);
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
        public double getArea() {
            return width*length;
        }

        @Override
        public String toString() {
            return "Rectangle{" + "width=" + width + ", length=" + length + '}';
        }
    }

    public class Square extends Rectangle {
        public double side;
        public Square() {}
        public Square(double side) {
            this.side=side;
        }
        public Square(double side,String color,boolean filled) {
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }
        @Override
        public void setWidth(double side) {
            this.side=side;
        }
        @Override
        public void setLength(double side) {
            this.side=side;
        }
        public String toString() {
            return "side" + side;
        }
    }

    public class Main{
        public static void main(String[] args) {
            double radius,width,length,side;
            Scanner scanner = new Scanner(System.in);
            Shape shape= new Shape();
            shape.getColor();
            String mau = shape.getColor();
            System.out.println("Mau cua hinh: " + mau);
            System.out.print("Nhap ban kinh cua duong tron: ");
            radius = scanner.nextDouble();
            Shape chuvi = new Shape();
            System.out.println("Chu vi hinh tron la: ");
            System.out.println("Dien tich hinh tron la: ");

        }
    }