public class sorting1 {
    //bubble sorting

    public static void printArray(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {7, 8, 3, 2, 1};
        //time complexity = 0(n^2)

        for(int i = 0; i <arr.length - 1; i++){ //n-1
            for (int j = 0; j <arr.length - i - 1; i++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
