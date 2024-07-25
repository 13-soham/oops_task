package Arrays;

public class MaxSubArray {
    public static int max(int arr[]){
        int a = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            a = a + arr[i];
            if(a >= sum){                          // kadane's algo...
                sum = a;
            }
            if(a < 0){
                a = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {3, -6, 2, 4, 6, -7, 3};
        int ans = max(arr);
        System.out.print("Maximum sum of subarray : "+ ans);
    }
}
