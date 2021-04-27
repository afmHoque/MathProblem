package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {

        HashMap<Integer, String > map = new HashMap<Integer, String >();

        map.put(1," Dhaka");
        map.put(2," NYC");
        map.put(3," London");
        map.put(4," Boston");
        map.put(5," Hello");


        for( Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }


    }
}
