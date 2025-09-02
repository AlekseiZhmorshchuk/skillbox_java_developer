import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Reverse arrayRevers = new Reverse();

        String[] word = {"one", "two", "three", "four", "five", "six"};

        System.out.println(Arrays.toString(word));
        arrayRevers.replacingTheOrder(word);
        System.out.println(Arrays.toString(word));

        // меняем порядок массива с помощью стрима
        //Object[] reversedArr = IntStream.rangeClosed(1, word.length)
        //      .mapToObj(i -> word[word.length - i])
        //      .toArray();
        //System.out.println(Arrays.toString(word));

        // преобразуем массив в список и используем метод revers
        Collections.reverse(Arrays.asList(word));
        System.out.println(Arrays.toString(word));
    }
}
