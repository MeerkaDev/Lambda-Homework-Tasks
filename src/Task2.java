import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Task2 {
    public static void main(String[] args) {

        // Преобразуйте все слова в списке в верхний регистр.

        List<String> words = new ArrayList<>();
        words.add("sss");
        words.add("DexterMorgan");
        words.add("woooow");
        words.add("Hello");
        words.add("Elvis");

        UnaryOperator<List<String>> unaryOperator = list -> {
            List<String> result = new ArrayList<>();

            for (String i : list) {
                result.add(i.toUpperCase());
            }

            return result;
        };

        System.out.println(unaryOperator.apply(words));
    }
}
