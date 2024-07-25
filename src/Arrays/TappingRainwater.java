package Arrays;

public class TappingRainwater {
    public static int leftMax(int arr[], int limit){
        int p1 = Integer.MIN_VALUE;
        for(int j = 0; j < limit; j++){                              // Time complexity = O(n)
            if(p1 < arr[j]){
                p1 = arr[j];
            }
        }
        return p1;
    }
    public static int rightMax(int arr[], int limit){
        int p2 = Integer.MIN_VALUE;
        for(int j = limit + 1; j < arr.length; j++){
            if(p2 < arr[j]){
                p2 = arr[j];
            }
        }
        return p2;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        int ans = 0;
        int a = arr.length-1;
        for(int i = 1; i < a; i++){
            int b1 = leftMax(arr, i);
            int b2 = rightMax(arr, i);
            if((Math.min(b1, b2) - arr[i]) < 0){
                continue;
            }
            else{
                ans = ans + (Math.min(b1, b2) - arr[i]);
            }
        }
        System.out.println("Area of Trapping water is "+ans+" units.");
    }
}
//in place of line no. 29 to 35 => we can write this...
/*if(b1 > b2){
                if((b2 - arr[i]) < 0){
                    continue;
                }
                else{
                    ans = ans + (b2 - arr[i]) * 1;
                }
            }
            else if(b1 < b2){
                if((b1 - arr[i]) < 0){
                    continue;
                }
                else{
                    ans = ans + (b1 - arr[i]) * 1;
                }
            }

 */
