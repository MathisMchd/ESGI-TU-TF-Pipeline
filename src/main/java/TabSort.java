import java.util.Arrays;


public class TabSort {

    public static int[] SortAsc(int[] tab) {
        for (int i= 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[ j+1 ];
                    tab[j+1] = temp;
                }
            }
        }
        return tab;
    }

    public static int[] SortDesc(int[] tab) {
        for (int i= 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if (tab[j] < tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[ j+1 ];
                    tab[j+1] = temp;
                }
            }
        }
        return tab;
    }


    public static int[] sort(int[] tab, SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            return SortAsc(tab);
        } else {
            return SortDesc(tab);
        }
    }
}
