package training;

public class PloyEx {

    int a, b;
    final int k= 8;

    public void add() {
        System.out.println(1+2);
    }

    public int add(int c) {
        return c;
    }

    public void add(int a, int b)
    {
        this.a=a;
        this.b= b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String args[]) {
        PloyEx p = new PloyEx();
//        p.add();
//        p.add(1,3);
//        System.out.println(p.a);
//        System.out.println(p.b);
//        p.add(1,4,6);
//        System.out.println(p.add(1,2,3));
    }
}
