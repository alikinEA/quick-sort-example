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
        quickSort(list,0,list.size() - 1);
        return list;
    }

    private void quickSort(List<Integer> list, int firstIdx, int endIdx) {
        if (firstIdx < endIdx) {
            int partIdx = partition(list, firstIdx, endIdx);

            quickSort(list,partIdx + 1,endIdx);
            quickSort(list,firstIdx,partIdx - 1);
        }
    }

    private int partition(List<Integer> list, int firstIdx, int endIdx) {
        int lastElement = list.get(endIdx);
        int currentElementIdx = firstIdx;

        int temp;
        for (int i = firstIdx; i < endIdx; i++) {
            if (lastElement >= list.get(i)) {
                temp = list.get(i);
                list.set(i,list.get(currentElementIdx));
                list.set(currentElementIdx,temp);
                currentElementIdx++;
            }
        }
        temp = list.get(endIdx);
        list.set(endIdx,list.get(currentElementIdx));
        list.set(currentElementIdx,temp);

        return currentElementIdx;
    }
}
