import java.util.*;
public class loops{
    public static void main(String[] args) {
        
// do while loop
/* 
        int counter =1;
        do{
            System.out.println("hello world");
            counter = counter +1;
        } while(counter <=10);
*/

// for loop
/* 
        for (int i=1;i<=10; i++){
            System.out.println("hello world");
        }
*/

// While Loop

// sum of natural number until the user want 
/* 
            System.out.println("enter the numbers until you want your sum");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i =1;
            int sum=0;
            while(i<=n){
                sum = sum+i;
                i=i+1;
            }
            System.out.println(sum+ ": this is your answer");
*/

/* 
        //Print hello world acording to user.
        System.out.println("enter number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int counter =1;
        while (counter<=n){
            System.out.println(counter + "");
            counter = counter +1;
        }
*/

        // Print numbers from 1 to 10 using while loop.
/* 
        int counter =1;
        while(counter<=10){
            System.out.println(counter);
            counter++;
        }
*/

        // Print hello world 100 times.
/* 
        int counter=0;
        while(counter<100){
            System.out.println("hello world");
            counter ++;
        }
        System.out.println("print hello print 100 times");
*/
    }
}