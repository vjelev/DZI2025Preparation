public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,7,1,2,3,2,8,8,9,43,12};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] arr){
    int bigIndexPos = 0;
    int iterations = 0;

    while (iterations < arr.length-1){
        for (int i = 0; i < arr.length - iterations; i++) {
            if (arr[i] > arr[bigIndexPos]) {
                bigIndexPos = i;
            }
            if(i == arr.length - iterations - 1){
                if(bigIndexPos!=i){
                    int temp = arr[i];
                    arr[i] = arr[bigIndexPos];
                    arr[bigIndexPos] = temp;
                }
            }
        }
        bigIndexPos = 0;
        iterations++;
    }

    }
}

