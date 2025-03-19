public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,7,1,2,3,2,8,8,9,43,12};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
