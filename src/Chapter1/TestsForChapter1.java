package Chapter1;
import java.util.Arrays;
public class TestsForChapter1 {
    public void Tests() {
        int[] test = {4,5,1,1,9,6};
        Chapter1.Exercise2 ex2 = new Chapter1.Exercise2();
        System.out.println("Smallest number is: " + ex2.findMin(test));
        System.out.println("index of 1 is: " + ex2.find(test,1));
        System.out.println("sum of all elements is: " + ex2.sumArray(test));
        ex2.printArray(test);
        int[] reversed = ex2.reverseArray((test));
        ex2.printArray(reversed);


        Chapter1.Exercise3 ex3 = new Chapter1.Exercise3();
        System.out.println("sum of 4 and 8 " + Arrays.toString(ex3.conditionalCalculation(4,8)));
        System.out.println("mult of 5 and 13 " + Arrays.toString(ex3.conditionalCalculation(5,13)));
        System.out.println("squares of 5 and 4 are: " + Arrays.toString(ex3.conditionalCalculation(5,4)));
        System.out.println(Arrays.toString(ex3.scannerCalculation()));


        Chapter1.Exercise4 ex4 = new Chapter1.Exercise4();
        ex4.calc();
        int[] test2 = {5,4,1,6,3,13,93,24,2};
        int[][] multitest = {
                {1,2,3},
                {5,6,3},
                {9,7,18}
        };

        Chapter1.Exercise6 ex6 = new Chapter1.Exercise6();
        System.out.println(ex6.search(test2,13));
        System.out.println(Arrays.toString(ex6.multiSearch(multitest,18)));
    }
}

