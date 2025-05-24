sealed class Student permits Ranjeet, Priyanka, Gupta, Manasvi {
    void sayHello() {
        System.out.println("Today is sealed class");
    }
}



final class Ranjeet extends Student {
    void sayHello() {
        System.out.println("Hello from Ranjeet");
    }
}

final class Priyanka extends Student {
    void sayHello() {
        System.out.println("Hello from Priyanka");
    }
}

final class Gupta extends Student {
    void sayHello() {
        System.out.println("Hello from Gupta");
    }
}

final class Manasvi extends Student {
    void sayHello() {
        System.out.println("Understand");
    }
}


public class sealedclassdemo{
    public static void main(String[] args) {
        Student s = new Manasvi();
        s.sayHello();
    }
}

