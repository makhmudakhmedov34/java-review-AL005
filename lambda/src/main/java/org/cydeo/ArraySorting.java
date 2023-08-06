package org.cydeo;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();

        QuickSort quickSort = new QuickSort();
        as.sort(quickSort);
        BubbleSort bubbleSort = new BubbleSort();
        as.sort(bubbleSort);


        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSorting = () -> System.out.println("Quick sorting");
        as.sort(quickSorting);

        Sorting bubbleSorting = () -> System.out.println("Bubble sorting");
        as.sort(bubbleSorting);

        as.sort(() -> System.out.println("Quick sorting"));


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}


