import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Task1 {
    public static void main(String[] args) {

        // Выберите слова из списка, длина которых превышает 7 символов.

        List<String> words = new ArrayList<>();
        words.add("1234567");
        words.add("DexterMorgan");
        words.add("12345678");
        words.add("Hello");
        words.add("Elvis");

        UnaryOperator<List<String>> unaryOperator = list -> {
            List<String> result = new ArrayList<>();

            for (String s : list) {
                if (s.length() > 7) {
                    result.add(s);
                }
            }
            return result;
        };

        System.out.println(unaryOperator.apply(words));
    }
}
