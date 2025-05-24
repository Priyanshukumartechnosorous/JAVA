public class SealedEx {
    public static void main(String[] args) {
        name n = new manasvi();
        n.display();
    }
    
}

sealed class name permits kumar,manasvi{
    void display(){
        System.out.println("hello");
    }
}

final class kumar extends name{
    void display(){
        System.out.println("hello from kumar");
    }


    
}
final class manasvi extends name{
    void display(){
        System.out.println("hello from manasvi");
    }
}

