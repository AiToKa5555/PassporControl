import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static int[] incrementer(int[] numbers) {
        if (numbers == null){
            return null;
        }
        else {
            int[] result = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] + i + 1 > 9){
                    int a = numbers[i] + i + 1;
                    a = a % 10;
                    result[i] = a;
                }
                result[i] = numbers[i] + i + 1;
            }
            return result;
        }
    }
    public static int duplicates(int[] array) {
            Arrays.sort(array);
            int result = 0;
//        Set<Integer> mySet = new TreeSet<>(List.of(array));

            if (result % 2 != 0){
                result--;
            }
            return result;
    }

    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{1, 2, 5, 6, 5, 2}));
    }
}
