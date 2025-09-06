package training;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesEx {

    public static void main(String args[]) {

        String s= "stjgghddydteacvacssd";

        //print all duplicate characters
        Map<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);  //g,2 d,2
            }else{
                map.put(s.charAt(i), 1);  //s,2  t,1 g, 1 h,1 d,1
            }
        }

        for(Map.Entry<Character, Integer> l: map.entrySet()) {
            if(l.getValue()>1){
                System.out.print(l.getKey());
            }
        }

    }
}
