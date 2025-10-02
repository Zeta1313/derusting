import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> a = new ArrayList<String>();
    // Add 3 elements to the list (OK to do one-by-one)
    a.add("lol");
    a.add("zoz");
    a.add("tot");
    // Print the element at index 1
    System.out.println (a.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    a.set(1, "viv");
    // Insert a new element at index 0 (the length of the list will change)
    a.add(0, "Gog");
    // Check whether the list contains a certain string
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) == "viv") {
        System.out.println("Found viv");
      }
    }
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < a.size(); i++) {
        System.out.println(i);
        System.out.println(a.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(a);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String x : a) {
      System.out.println(x); }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}