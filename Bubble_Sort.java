import java.util.*;

public class Bubble_Sort {


    public static void main(String[] args){

        int[] arr = new int[5];
        insertElement(arr);
        System.out.println("Before sort : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }




    // Insert Elements in array 
    public static void insertElement(int[] arr){

        Scanner sc = new Scanner(System.in);

        System.out.println("Plz Elenter element : ");

        for(int i = 0 ; i < arr.length;i++){
         arr[i] = sc.nextInt();
        }
    }


     // Bubble sort Logic 
    public static void bubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 0 ; j  < arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp ;
                }
            }
        }
    }
}
