package lesson;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] simpleArray = new String[2];
        simpleArray[0] = "apple";
        simpleArray[1] = "peach";
        System.out.println("simpleArray méret: " + simpleArray.length);

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("peach");
        System.out.println("első elem: " + list.get(0) + " méret: " + list.size());
        list.remove(0);
        System.out.println("első elem: " + list.get(0) + " méret: " + list.size());
    }
}
