import java.util.Scanner;
import java.util.Arrays;
public class InserstionSort {
    public static void main(String[] args){

        int[] arr = new int[5];

        insertElement(arr);
        System.out.println("Before sort : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){

        for(int i = 1 ; i <arr.length; i++){
        int key = arr[i] ;
        int j = i-1 ;

             while(j >= 0 && arr[j]> key){
              arr[j+1]=arr[j];
              j-- ;
            }
            arr[j+1]= key ;
        }
        
    }
 
     // Insert Elements in array 
     public static void insertElement(int[] arr){

        Scanner sc = new Scanner(System.in);

        System.out.println("Plz Elenter element : ");

        for(int i = 0 ; i < arr.length;i++){
         arr[i] = sc.nextInt();
        }
    }

}
