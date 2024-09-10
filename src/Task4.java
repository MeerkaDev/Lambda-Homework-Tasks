import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {

        // Преобразуйте список строк в список их длин.

        List<String> words = new ArrayList<>();
        words.add("1234567");
        words.add("DexterMorgan");
        words.add("12345678");
        words.add("Hello");
        words.add("Elvis");

        Function<List<String>, List<Integer>> function = listStrings -> {
            List<Integer> result = new ArrayList<>();
            for (String str : listStrings) {
              result.add(str.length());
          }
            return result;
        };

        System.out.println(function.apply(words));
    }
}
