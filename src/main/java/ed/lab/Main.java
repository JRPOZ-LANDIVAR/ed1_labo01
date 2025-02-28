package ed.lab;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {
    private static final ArrayGenerator<Integer> sortedArrayGenerator = (int length) -> {

    Integer[] arreglo = new Integer[length];
    for(int i = 0; i<length ; i++ ){

        arreglo[i] = i;
    }
        return arreglo;
    };

///


    private static final ArrayGenerator<Integer> invertedArrayGenerator = (int length) -> {

        Integer[] arreglo = new Integer[length];
        for(int i = 0; i<length ; i++){

            arreglo[i] = length-1-i;
        }
        return arreglo;
    };

    private static final ArrayGenerator<Integer> randomArrayGenerator = (int length) -> {
        Random random = new Random();
        Integer[] arreglo = new Integer[length];
        for(int i = 0; i<length ; i++){

            arreglo[i] = random.nextInt(100);
        }
        return arreglo;
    };

    private static final QuickSort<Integer> highPivotQuickSort =  array -> SortingAlgorithms.highPivotQuickSort(array); // Reemplácelo por una referencia a un método

    private static final QuickSort<Integer> lowPivotQuickSort = array -> SortingAlgorithms.lowPivotQuickSort(array); // Reemplácelo por una referencia a un método

    private static final QuickSort<Integer> randomPivotQuickSort = array -> SortingAlgorithms.randomPivotQuickSort(array); // Reemplácelo por una referencia a un método

    public static QuickSort<Integer> getHighPivotQuickSort() {
        return highPivotQuickSort;
    }

    public static QuickSort<Integer> getLowPivotQuickSort() {
        return lowPivotQuickSort;
    }

    public static QuickSort<Integer> getRandomPivotQuickSort() {
        return randomPivotQuickSort;
    }

    public static ArrayGenerator<Integer> getSortedArrayGenerator() {
        return sortedArrayGenerator;
    }

    public static ArrayGenerator<Integer> getInvertedArrayGenerator() {
        return invertedArrayGenerator;
    }

    public static ArrayGenerator<Integer> getRandomArrayGenerator() {
        return randomArrayGenerator;
    }

    public static void main(String[] args) {
        final SortingTester<Integer> tester = new SortingTester<>();

        System.out.println("Ordenando un arreglo ordenado:");
        System.out.println("\tUtilizando el último elemento como pivote: ");
        tester.testSorting(sortedArrayGenerator, highPivotQuickSort);
        System.out.println("\tUtilizando el primer elemento como pivote: ");
        tester.testSorting(sortedArrayGenerator, lowPivotQuickSort);
        System.out.println("\tUtilizando un elemento aleatorio como pivote: ");
        tester.testSorting(sortedArrayGenerator, randomPivotQuickSort);
        System.out.println("================================");

        System.out.println("Ordenando un arreglo invertido:");
        System.out.println("\tUtilizando el último elemento como pivote: ");
        tester.testSorting(invertedArrayGenerator, highPivotQuickSort);
        System.out.println("\tUtilizando el primer elemento como pivote: ");
        tester.testSorting(invertedArrayGenerator, lowPivotQuickSort);
        System.out.println("\tUtilizando un elemento aleatorio como pivote: ");
        tester.testSorting(invertedArrayGenerator, randomPivotQuickSort);
        System.out.println("================================");

        System.out.println("Ordenando un arreglo aleatorio:");
        System.out.println("\tUtilizando el último elemento como pivote: ");
        tester.testSorting(randomArrayGenerator, highPivotQuickSort);
        System.out.println("\tUtilizando el primer elemento como pivote: ");
        tester.testSorting(randomArrayGenerator, lowPivotQuickSort);
        System.out.println("\tUtilizando un elemento aleatorio como pivote: ");
        tester.testSorting(randomArrayGenerator, randomPivotQuickSort);
        System.out.println("================================");


    }
}