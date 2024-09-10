import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class Task6 {
    public static void main(String[] args) {

        // Отсортируйте список строк по количеству символов в порядке возрастания, а затем переведите их все в
        // нижний регистр.

        List<String> words = new ArrayList<>();
        words.add("sssSs");
        words.add("DexterMorgan");
        words.add("wooASDoow");
        words.add("Hello");
        words.add("Elvis");

        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        UnaryOperator<List<String>> unaryOperator = listStrs -> {
            List<String> result = new ArrayList<>();
            listStrs.sort(comparator);

            for (String str : listStrs) {
                result.add(str.toLowerCase());
            }

            return result;
        };
        System.out.println(unaryOperator.apply(words));
    }
}
