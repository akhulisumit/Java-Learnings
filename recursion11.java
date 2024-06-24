public class recursion11 {
    //check if the array is sorted(strictly increasing)
    public static boolean isSorted(int array[],int index){
        if(index == array.length-1){
            return true;
        }
        if(array[index]<array[index+1]){
            return isSorted(array, index+1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        System.out.println(isSorted(array, 0));
    }
}

