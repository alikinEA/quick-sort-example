import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by Alikin E.A. on 13.08.18.
 */
public class TestSort {

    private static final int ARRAY_SIZE = 10_000;

    private List<Integer> listForSort;

    @Before
    public void initTestData() {
        listForSort = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            listForSort.add(random.nextInt(ARRAY_SIZE));
        }
    }


    @Test
    public void jdkSortImpl() {
        Long startTime = new Date().getTime();

        Collections.sort((listForSort));

        for (int i = 1; i < listForSort.size() - 1; i++) {
            int compare = listForSort.get(i).compareTo(listForSort.get(i - 1));
            Assert.assertTrue(compare == 1 || compare == 0);
        }

        System.out.println("Sort end = " + (new Date().getTime() - startTime));
    }

    @Test
    public void testQuickSortImpl() {
        Sort sort = new QuickSortImpl();
        Long startTime = new Date().getTime();

        List<Integer> sortedList = sort.sort(listForSort);

        for (int i = 1; i < sortedList.size() - 1; i++) {
            int compare = sortedList.get(i).compareTo(sortedList.get(i - 1));
            Assert.assertTrue(compare == 1 || compare == 0);
        }

        System.out.println("Sort end = " + (new Date().getTime() - startTime));
    }

    @Test
    public void testBubbleSortImpl() {
        Sort sort = new BubbleSortImpl();
        Long startTime = new Date().getTime();

        List<Integer> sortedList = sort.sort(listForSort);

        for (int i = 1; i < sortedList.size() - 1; i++) {
            int compare = sortedList.get(i).compareTo(sortedList.get(i - 1));
            Assert.assertTrue(compare == 1 || compare == 0);
        }

        System.out.println("Sort end = " + (new Date().getTime() - startTime));
    }
}
