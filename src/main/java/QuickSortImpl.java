import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alikin E.A. on 13.08.18.
 */
public class QuickSortImpl implements Sort {

    @Override
    public List<Integer> sort(List<Integer> list) {

        if (list.size() == 1 || list.size() == 0) {
            return list;
        }

        int lastElementIdx = list.size() - 1;

        List<Integer> leftOfPivot = new ArrayList<>();
        List<Integer> rightOfPivot = new ArrayList<>();


        for (int i = 0; i < lastElementIdx; i++) {
            Integer element = list.get(i);
            if (element.compareTo(list.get(lastElementIdx)) == -1) {
                leftOfPivot.add(element);
            } else {
                rightOfPivot.add(element);
            }
        }

        List<Integer> result = sort(leftOfPivot);
        result.add(list.get(lastElementIdx));
        result.addAll(sort(rightOfPivot));
        return result;
    }
}
