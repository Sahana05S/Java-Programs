import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int  val= arr[i];//make a duplicate of the current element
            int j = i - 1;//to iterate to previous values
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];//to swap the values
                j--;//reduce to check the previous elements whether they are sorted too
            }
            arr[j + 1] = val;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
