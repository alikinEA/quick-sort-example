import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alikin E.A. on 13.08.18.
 */
public class BubbleSortImpl implements Sort {
    @Override
    public List<Integer> sort(List<Integer> list) {

        int[] arr = list.stream().mapToInt(i->i).toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {

                if (arr[j - 1] > arr[j]) {
                    Integer temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
