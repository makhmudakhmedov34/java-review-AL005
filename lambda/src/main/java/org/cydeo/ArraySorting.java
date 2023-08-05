package org.cydeo;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();

        QuickSort quickSort = new QuickSort();
        as.sort(quickSort);
        BubbleSort bubbleSort = new BubbleSort();
        as.sort(bubbleSort);


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }


}
