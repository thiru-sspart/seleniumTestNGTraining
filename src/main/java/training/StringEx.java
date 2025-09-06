package training;

public class StringEx {

    public static void main(String args[]) {

        String s= "0123456789";
        String s2= "selenium";

        //charcater array

        String s1= new String("Selenium");
        String s3= new String("selenium");

        System.out.println(s.equalsIgnoreCase(s1));
         String in= "Your order placed Successfully. Order number: 8367846";

         String i[]= in.replace(" ", "").split("[a-z A-Z .:]");

        System.out.println(in.contains("successfully"));

        String a= "This";
        a.concat(" is");
        System.out.println(a.concat(" selenium"));
        a=a.replace("i", "*");
        System.out.println(s.substring(2, 5));
        System.out.println(s.substring(2));

        StringBuffer sb = new StringBuffer("Sachin");
        sb.append(" Ten");

        String si= "Sachin";
        si.concat(" Ten");
        System.out.println(sb);
        System.out.println(si);
        try {
            Thread.sleep(5000); //click element //4th
        }catch(Exception e) {
            System.out.println("Just exp move on");
            //refresh
        }
        System.out.println();






    }
}
