public class sorting {

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
