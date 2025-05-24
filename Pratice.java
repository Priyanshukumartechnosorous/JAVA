public class Pratice {
    public static void main(String[] args) {
        Rectangle r =new Rectangle();
        r.breadth=10;
        r.lenght=2;
        System.out.println(r.area());
         Square s= new Square();
        s.side=10;
        System.out.println(s.area());
    }
}
abstract class Shape {
    abstract double perimeter();
    abstract double area();
}
class Rectangle extends Shape {
    double lenght;
    double breadth;
    double perimeter(){
        return 2*(lenght+breadth);
    }
    double area() {
        return lenght*breadth;
    }
}
class Square extends Shape {
    double side;
    double area() {
        return 2*side;
    }
    double perimeter() {
        return 4*side;
    }
}