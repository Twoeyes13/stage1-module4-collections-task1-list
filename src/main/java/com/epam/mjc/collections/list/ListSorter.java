package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        int position;
        int min;

        ListComparator comparator = new ListComparator();
        for (int i = 0; i < sourceList.size(); i++) {
            min = Integer.valueOf(sourceList.get(i));
            position = i;

            for (int j = i + 1; j < sourceList.size(); j++) {
                if (comparator.compare(sourceList.get(position),sourceList.get(j)) == 1) {
                    min = Integer.valueOf(sourceList.get(j));
                    position = j;
                }
            }

            Collections.swap(sourceList, position, i);
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int left = 5 * (int) Math.pow(Integer.valueOf(a), 2) + 3;
        int right = 5 * (int) Math.pow(Integer.valueOf(b), 2) + 3;

        if (left > right) return 1;
        if (left == right && Integer.valueOf(a) > Integer.valueOf(b)) return 1;

        return 0;
    }
}
