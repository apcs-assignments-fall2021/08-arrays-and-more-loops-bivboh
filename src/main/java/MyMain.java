import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int [] rotated = new int[arr.length];
        rotated[arr.length-1] = arr[0];
        for (int i = 0; i < arr.length - 1; i++){
            rotated[i] = arr[i + 1];
        }
        return rotated;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int rotated_at_index_one = arr[arr.length - 1];
        for (int i = arr.length-2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = rotated_at_index_one;
        return arr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        int array_length = arr.length;
        int i = 0;
        for (i = 0; i < array_length; i++){
            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
