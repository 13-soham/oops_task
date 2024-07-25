package Arrays;

public class printSubarrays {
    public static void Subarr(int arr[]){
        int count = 0;
        for(int i=0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+ " ");
                }
                count++;
                System.out.print(" => sub array no. "+ count);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no. of subarrays : "+ count);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 1, 8, 3, 9};
        Subarr(arr);
    }
}
