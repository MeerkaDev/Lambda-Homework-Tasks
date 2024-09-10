import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task7 {
    public static void main(String[] args) {

        // Напишите анонимную функцию, которая проверяет, есть ли в списке простое число.

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(24);
        nums.add(3);
        nums.add(-4);
        nums.add(-8);
        nums.add(8);
        nums.add(4);

        Predicate<List<Integer>> predicate = listInts -> {
            for (Integer num : listInts) {
                if (num <= 1) continue;

                int succeedDevisions = 0;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        succeedDevisions++;
                    }
                }
                if (succeedDevisions == 0) {
                    return true;
                }
            }
            return false;
        };
        System.out.println(predicate.test(nums));
    }
}
