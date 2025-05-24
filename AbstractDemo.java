public class AbstractDemo {
    public static void main(String[] args) {
        Super s= new Sub();
        s.meth1();
        s.meth2();

    }    
}

abstract class Super {
    Super() {
        System.out.println("super");
    }
    void meth1() {
        System.out.println("super method1");
    }
    abstract void meth2();

    
}
class Sub extends Super {
    void meth2() {
        System.out.println("sub method 2");
    }


    
}
