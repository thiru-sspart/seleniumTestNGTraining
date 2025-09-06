package training;

public class A {

    String a3="a3";
    public void a1(){
        System.out.println("a1");
    }

    public void a2() {
        System.out.println("a2");
    }

    public void d(){
        System.out.println("d in A");
    }

    public final void d1(){
        System.out.println("d in A");
    }

    public static void main(String args[]) {
        A a = new A();
    }
}
