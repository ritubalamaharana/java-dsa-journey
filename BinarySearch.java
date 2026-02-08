import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements:");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Enter the element you want to search:");
        int target = sc.nextInt();
        int result = binarySearch(array, target);
        System.out.println(target + " is at index " + result);
        sc.close();
    }
}
