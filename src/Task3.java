import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Task3 {
    public static void main(String[] args) {

        // Создайте новый список, содержащий квадраты чисел из исходного списка.

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        UnaryOperator<List<Integer>> unaryOperator = list -> {
          List<Integer> result = new ArrayList<>();

          for (Integer i : list) {
              result.add(i * i);
          }

          return result;
        };

        System.out.println(unaryOperator.apply(nums));
    }
}
