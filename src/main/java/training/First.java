package training;

public class First {

    public int a=7;
  private int b;
  String s;
    //global variables

    public static First add() {
       First s = new First();
       s.a=78;
       return s;
    }

    // access modifiers, return type, method name  --> mandate
    // asInSelenium
    //validate_login_funtionality()
    //t01_validateLoginFunctionality()
    //a- variable, a()-method

    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    public static void pr() {
//        First f= new First();
//        f.sub();
        System.out.println("Just printing");
    }

    public static void main(String args[]) {

        First f= new First();
        f.sub(2,3);

        System.out.println(add().a);


//        f.sub();
//        f.a=7;
//        f.b=9;
//        System.out.println(f.a*f.b);
//        pr();

    }


}
