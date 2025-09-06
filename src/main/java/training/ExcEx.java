package training;

public class ExcEx {

    public static void add(int a, int b) throws InterruptedException {
  Thread.sleep(5000);
        System.out.println(a+b);
    }

    public static void main(String args[]) throws InterruptedException {

        //Testcase fail
        int i=0;
        try {
            int j[]= {1,2};
            j[3]= 4;
        }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("catch Array out of bound");
        }catch(Exception e){
            System.out.println("catch Exception");
        }
        finally {
            System.out.println("Finally block"); //report lo pass
        }


        //1st pass -> try , finally
        //2nd fail -> try, catch, finally
//        System.out.println(i);
//        add(1,2);

    }
}
