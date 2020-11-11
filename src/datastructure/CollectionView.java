
package datastructure;

import java.util.HashMap;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Yemen");
        map.put(2, "Oman");
        map.put(3, "Jorden");
        map.put(4, "Egipt");
        map.put(5, "Irag");
        map.put(6, "Pakistan");
        System.out.println(
                map
        );
        for (int i=1; i< map.size();i++){
            System.out.println(map.get(i));

        }

    }

}