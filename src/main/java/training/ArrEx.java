package training;

public class ArrEx {

    public int[] pntArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            arr[i]= arr[i]*2;
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String args[]) {
        ArrEx ex= new ArrEx();
        int b[]= ex.pntArr(new int[] {1, 3, 5, 7, 9});

        for(int i:b) {
            System.out.print(i);
        }
    }

}
