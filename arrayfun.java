public class arrayfun {

/*
// binary search
    public static int binarysearch(int numbers[], int key){
        int start =0, end =numbers.length-1;

        while(start<=end){
            int mid =(start+end)/2;

            //comparison
            if (numbers [mid]==key){
                return mid;
            }
            if (numbers[mid]<key){//right of array
                start=mid+1;
            }
            else {//left of array
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int key =10;

        System.out.println("index for key is : "+binarysearch(numbers,key));
    }
*/

/*
//largest numbers from the gievn array
    public static int getlargest(int numbers[]){
        int largest =Integer.MIN_VALUE; // -infinity

        for(int i=0; i<numbers.length; i++){
            if (largest<numbers[i]){
                largest =numbers[i];
            }
        }
        return largest;
    }

    public static void main (String args[]){
        int numbers[]={1,2,6,3,5,100};
        System.out.println("largest value is : "+getlargest(numbers));
    }
*/

/* 
// linear search
    public static int linearsearch(int numbers[],int key){
        for (int i =0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16};
        int key =10;

        int index= linearsearch(numbers, key);
        if (index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index : "+index);
        }
    }
*/

// array as a funtion argument
/* 
    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99}; 
        update (marks);

        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+"  ");
        }
        System.out.println( );
    }
*/

}

