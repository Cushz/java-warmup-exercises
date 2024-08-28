package Chapter1;

public class Exercise6 {
    public int search(int[] array, int value)
    {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }
    public int[] multiSearch(int[][] array, int value) {
        int[] sum = new int[2];
        int[] error = {-1,-1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (value == array[i][j]) {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }
        return error;
    }
}
