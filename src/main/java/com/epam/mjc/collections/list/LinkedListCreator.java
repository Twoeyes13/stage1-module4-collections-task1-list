package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList resultList = new LinkedList();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                resultList.addLast(sourceList.get(i));
            } else {
                resultList.addFirst(sourceList.get(i));
            }
        }
        return resultList;
    }
}
