package training;

public class B extends A{

    String b3;

    B(String b3) {
        this.b3= b3;

    }

    B() {
        System.out.println("In con of B class");
    }

    B(int a, int b) {
        System.out.println(a+b);
    }


    public void b1(){
        System.out.println("b1");
    }

    public void b2() {
        System.out.println("b2");
    }


    public void d(){
        System.out.println("d in B");
    }

//    public void d1(int a){
//        System.out.println("d in B");
//    }

    public static void main(String args[]) {
        B ob= new B("Hi");
        System.out.println(ob.b3);

        B ob1 = new B();

        B ob2 = new B(1,2);
    }
}
