public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 33, 25};
        System.out.print("Unsorted array:");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        bubbleSort(arr);
        System.out.print("\nSorted array:");
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}