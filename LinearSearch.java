public class LinearSearch {
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
               if(arr[i] == target) {
                    return true;
                }
            
        }return false;
      
    }
    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {5,10,23,44, 67,89,90};
        int target = 5;
        //System.out.println(linearSearch(arr, target))
        System.out.println(binarySearch(arr, target));
       
    }
}
