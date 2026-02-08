public class BubbleSort {
    public static void bubbleSort(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    array[j]=array[i];
                }
                else{
                    array[j]=array[j];
                }
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,90,56,8,43};
        bubbleSort(arr);
    }
}
