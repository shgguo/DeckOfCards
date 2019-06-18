
import java.util.ArrayList;
  /*manipulate array lists using various methods
   * array lists are similar to arrays
   * Both are lists of data
   * however, array lists have flexibility with size
   * while arrays have a fixed length
   * array lists only store objects
   * arrays can store primitive data types like int and double
   * */
  public class ArrayListNotes{
    public static void main(String[] args){
      ArrayList<Double> nums = new ArrayList<Double>();
      //array list of doubles
      nums.add(2.0); //input 2.0 into nums ArrayList
      nums.add(3.0); //input 3.0 right after 2.0 in nums ArrayList
      nums.add(0, 1.0); // input 1.0 at index 0 of nums
      //2.0 and 3.0 are now shifted to the right in the numsArrayList
      double ex = nums.get(2); //gets value from nums at index 2 (should be 3.0)
      System.out.println(ex);
      
      ArrayList<Integer> digits = new ArrayList<Integer>();
      for(int k=0; k<5; k++){
        digits.add(2*k+1);
      }
      for(Integer i: digits) {
        System.out.println(i);
      }
      
      ArrayList<String> beatles = new ArrayList<String>();
      beatles.add("John");
      beatles.add("Paul");
      beatles.add("George");
      beatles.add("Ringo");
      
      for(String b: beatles){
        System.out.println(b);
      }
      beatles.set(2, "Jimmy Page"); // set method replaces at the given index
      System.out.println("");
      for(String b: beatles){
        System.out.println(b);
      }
      
      beatles.add(1, "Prince");
      beatles.add(4, "Dave Grohl");
      System.out.println("");
       for(String b: beatles){
        System.out.println(b);
      }
       
       System.out.println("");
       System.out.println(beatles.get(1)); //retrieve but leaves alone (draws w replacement)
       System.out.println(beatles.size());
      
       System.out.println("");
       System.out.println(beatles.remove(1)); //retrieve but takes (draws e/o replacement)
       System.out.println(beatles.size());
    }
  }
      

