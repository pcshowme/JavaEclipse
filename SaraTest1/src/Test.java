import java.util.Arrays;
import java.util.List;
public class Test {
   public static boolean contains(Integer[] arr, Integer item) {
      List<Integer> list = Arrays.asList(arr);
      return list.contains(item);
   }
   public static void main(String[] args) {
      Integer[] myArray = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15 };
      System.out.println(contains(myArray, 13));
      System.out.println(contains(myArray, 25));
   }
}