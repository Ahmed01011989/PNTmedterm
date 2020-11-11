package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals); // [Lion, Tiger, Cat, Dog]

        // add() -> push(): Add items to the end of an array
        animals.add("Elephant");
        System.out.println(animals);  // [Lion, Tiger, Cat, Dog, Elephant]

        // remove() -> pop(): Remove an item from the end of an array
        animals.remove(animals.size() - 1);
        System.out.println(animals); // [Lion, Tiger, Cat, Dog]

        // add(0,"xyz") -> unshift(): Add items to the beginning of an array
        animals.add(0, "Penguin");
        System.out.println(animals); // [Penguin, Lion, Tiger, Cat, Dog]

        // remove(0) -> shift(): Remove an item from the beginning of an array
        animals.remove(0);
        System.out.println(animals); // [Lion, Tiger, Cat, Dog]

        for(int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i));
            System.out.print(" ");
        }


    }

}
