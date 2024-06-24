public class recursion12 {
    //check if the array is sorted(strictly increasing)
    public static boolean isSorted(int array[],int index){
        if(index == array.length-1){
            return true;
        }
        if(array[index] >= array[index+1]){
            return false;
        }
        
        return isSorted(array, index+1);
        
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        System.out.println(isSorted(array, 0));
    }
}

