package strings;

// compare Strings as lexicographic order... a < b < c ...
// T(n) = O(no. of strings X maximum string length), if both are same and equals to n, then T(n) = O(n^2);

public class largest_string {
    public static void check(String arr[]){
        String output = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].compareTo(output) > 0){
                output = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println("largest string among those is : "+output);
    }
    public static void main(String[] args) {
        String arr[] = {"apple", "mango", "banana", "brother"};
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
        check(arr);
    }
}
