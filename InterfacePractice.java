public class InterfacePractice {
    public static void main(String[] args) {
        Test t =new My();
        t.meth1();
        t.meth2();
        //t.meth3();
    }
}
 interface Test {
    void meth1();
    void meth2();

    
}
class My implements Test {
    public void meth1() {
        System.out.println("Meth1 of class My");
    }
    public void meth2() {
        System.out.println("meth2 of class My");

    }
    public void meth3() {
        System.out.println("meth3 of class My");
    }
}

