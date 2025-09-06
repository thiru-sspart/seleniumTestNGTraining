package training;

public class C{

    String c3="c3";

    public void c1(){
        System.out.println("c1");
    }

    public void c2() {
        System.out.println("c2");
    }
    public void d(){
        System.out.println("d in C");
    }

    public static void main(String args[]) {
        C c = new C();
        c.d();
    }

}
