import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){

        
        int[] arr = new int[5];
        System.out.println("Entser Elements");
        insertElement(arr);
        System.out.println("Element before sort : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Element after sort : " + Arrays.toString(arr));
    }


    public static void insertElement(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void selectionSort(int [] arr){

        for(int i = 0 ; i < arr.length-1;i++){
            int minPos = i ;
            for(int j = i+1 ; j <arr.length;j++ ){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[i];
            arr[i]= arr[minPos];
            arr[minPos]= temp;
        }
    }
}
