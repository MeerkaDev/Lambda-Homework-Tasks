import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {

        // Определите, содержит ли список хотя бы одно отрицательное число.

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(-4);

        Predicate<List<Integer>> predicate = listInts -> {
          for (Integer i : listInts) {
              if (i < 0) {
                  return true;
              }
          }
          return false;
        };

        System.out.println(predicate.test(nums));
    }
}
