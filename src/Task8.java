import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task8 {
    public static void main(String[] args) {

        // Напишите анонимную функцию, которая принимает список целых чисел и возвращает сумму всех четных чисел.

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        Function<List<Integer>, Integer> function = listInts -> {
            int sum = 0;

            for (int number : listInts) {
                if (number % 2 == 0) {
                    sum += number;
                }
            }

            return sum;
        };

        System.out.println(function.apply(nums));
    }
}
