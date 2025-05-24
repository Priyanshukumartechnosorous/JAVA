public class AbstractExample {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.lenght=10;
        r.breadth=5;
        System.out.println(r.area()); 
       
    }
    
}
abstract class Shape {
    abstract double perimeter();
    abstract double area();
}
class Circle extends Shape {
    double radius;
    double perimeter(){
        return 2*Math.PI*radius;
    }
    double area() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape {
    double lenght;
    double breadth;
    double perimeter() {
        return 2*(lenght+breadth);
    }
    double area() {
        return lenght* breadth;
    }
}
