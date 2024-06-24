public class recursion6 {
    //to calculate the x to the power of n
    public static int calPower(int x, int n){

        if (x == 0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int getpowernm1 = calPower(x, n-1);
        int getpowerN = x * getpowernm1;
        return getpowerN;
    }

    public static void main(String[] args) {
        int x = 2, n =5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
