package main.java.dev.naspo.mergelinkedlists;// An algorithm I made to merge LinkedLists.
// (Merge meaning maintaining order, not just attaching).

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Objective: Merge two LinkedLists together. (Merge meaning ordered, not just attached).

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> newList = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(0);
        list2.add(2);
        list2.add(3);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        mergeLinkedLists(list1, 0, list2, 0, newList);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(newList);
    }

    // Merge two linked lists.
    public static void mergeLinkedLists(LinkedList<Integer> list1, int index1, LinkedList<Integer> list2,
                                        int index2, LinkedList<Integer> mergeList) {
        // Base case
        // if both lists have been run through, return.
        if (index1 >= list1.size() && index2 >= list2.size()) {
            return;
            // Otherwise if just list one has been run through, add all remaining values from list two and return.
        } else if (index1 >= list1.size()) {
            for (int i = index2; i < list2.size(); i++) {
                mergeList.add(list2.get(i));
            }
            return;
            // Otherwise if just list two has been run through, add all remaining values from list one and return.
        } else if (index2 >= list2.size()) {
            for (int i = index1; i < list1.size(); i++) {
                mergeList.add(list1.get(i));
            }
            return;
        }
        // Otherwise, both lists are still active and we can continue comparing.

        int val1 = list1.get(index1); // val1 is current value from list1.
        int val2 = list2.get(index2); // val2 is current value from list2.

        // If val1 is less than val2, add val1 to mergeList and recursively call mergeLinkedLists()
        // again with the next index for val1, and the same index for val2.
        if (val1 < val2) {
            mergeList.add(val1);
            mergeLinkedLists(list1, index1 + 1, list2, index2, mergeList);
            // Otherwise if val2 is less than val1, do the same as before but for val 2.
        } else if (val2 < val1) {
            mergeList.add(val2);
            mergeLinkedLists(list1, index1, list2, index2 + 1, mergeList);
            // Otherwise they are the same value.
            // Add then both and recursively call again with both increased indexes.
        } else {
            mergeList.add(val1);
            mergeList.add(val2);
            mergeLinkedLists(list1, index1 + 1, list2, index2 + 1, mergeList);
        }
    }
}