package Chapter1;

public class Exercise2 {
    public int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        int index = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            reversed[index] = array[i];
            index++;
        }
        return reversed;
    }
    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public int findMin(int[] array){
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public int find(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
