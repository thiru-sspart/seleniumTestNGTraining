package training;

import org.openqa.selenium.WebDriver;

public class Bike implements Vehicle{

    public void seat() {
        System.out.println(2);
    }

    public void engine() {
        System.out.println(3000);
    }

    public void wheels() {
        System.out.println(2);
    }

    protected void model(){

    }

    public static void main(String args[]) {
        Vehicle v= new Bike();
        v.seat();
    }


}
