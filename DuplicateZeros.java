import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        long zeroCount = Arrays.stream(arr).filter(x -> x == 0).count();
        int i = arr.length - 1;
        int j = arr.length - 1 + (int)zeroCount;

        while(i != j) {
            if(j < arr.length) {
                arr[j] = arr[i];
            }
            j--;
            if(arr[i] == 0) {
                if(j < arr.length) {
                    arr[j] = arr[i];
                }
                j--;
            }
            i--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println("Original array: " + Arrays.toString(arr));

        DuplicateZeros solution = new DuplicateZeros();
        solution.duplicateZeros(arr);

        System.out.println("Array after duplicating zeros: " + Arrays.toString(arr));
    }
}
