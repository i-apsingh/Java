import java.util.*;
public class sorting {


    /*
    //counting sort
    public static void countingsort(Integer arr[]){
        int largest =Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            largest =Math.max(largest,arr[i]);
        }

        int count[]= new int [largest+1];
        for (int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for (int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(Integer arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]={5,7,4,1,3,6,2};
        countingsort(arr);
        printarr(arr);
    }
    */

    /*
    //inbuilt sort
    //inbuilt function for sorting array
    public static void printarr(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,6,2,3};
        Arrays.sort(arr);
        printarr(arr);
    }
    */

    /* 
    //insertion sort
    public static void insertionsort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr =arr[i];
            int prev =i-1;
            //finding out to currect position to insert
            while (prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void printarr(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        printarr(arr);
        
    }
    */

    /* 
    // selection sort
    public static void selectionsort(int arr[]){
        for (int i=0; i<arr.length-1; i++){ // outer loop for count turn
            int minpos =i; // min positon of element which is current position
            for (int j=i+1;j<arr.length; j++){ // inner loop
                if (arr[minpos]>arr[j]){ // compare element 
                    minpos=j; // update minimum position
                }
            }
            //swap 
            int temp =arr[minpos];
            arr[minpos] =arr[i];
            arr[i]=temp;
        }
    }
    

    public static void printarr(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printarr(arr);
    }
    */

    //bubble sort
    /* 
    public static void bubblesort(int arr[]){
        for (int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printarr(arr);
    }
*/

}
