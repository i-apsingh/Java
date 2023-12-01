import java.util.*;
public class loops {
    public static void main (String args[]){
        //while loop
        Scanner select = new Scanner (System.in);
        System.out.println(" how many time you want to print hello world");
        int time = select.nextInt();

        int count =1;
        while (count<=time){
            System.out.println("hello world");
            count=count+1;    
        }
    }
}
