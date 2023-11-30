import java.util.*; 
// always use if you 
//use take input from user , this is a package

public class basic {
  public static void main(String[] args){

    //switch statement
    int month = 2;
    String monthString;
    switch (month) {
        case 1:  monthString = "January";
                 break;
        case 2:  monthString = "February";
                 break;
        case 3:  monthString = "March";
                 break;
        case 4:  monthString = "April";
                 break;
        case 5:  monthString = "May";
                 break;
        case 6:  monthString = "June";
                 break;
        case 7:  monthString = "July";
                 break;
        case 8:  monthString = "August";
                 break;
        case 9:  monthString = "September";
                 break;
        case 10: monthString = "October";
                 break;
        case 11: monthString = "November";
                 break;
        case 12: monthString = "December";
                 break;
        default: monthString = "Invalid month";
                 break;
    }
    System.out.println(monthString);

    
    

    //ternary operator
    /* 
    int num=5;
    String apple =((num%2)==0) ? "even" : "odd";
    // apple is name of variable
    //string is the type of "apple" variable
    System.out.println(apple);
    */

    /* 
    //else-if
    int age =13;

    if(age>=13){
      System.out.println("adults: ");
    }
    else if(age>=13 && age<18){
      System.out.println("teen");
    }
    else{
      System.out.println("child: ");
    }
    */

    //if-else
    /* 
    int age =22;
    if (age>=18) {
      System.out.println("adult");
    }
    else{
      System.out.println("not adult");
    }
    */

    //assignment operator
    /* 
    int a=10;
    //a=a+10; 
    //in above case ans is also 20
    a+=10;
    //in this case ans is also 20
    System.out.println(a);
    */

    //logical operatiors
    /* 
    System.out.println((3>2) && (5>0)); 
    //answer is true because both statements are true
    */
  
    //relational operators  
    /* 
    int a=10;
    int b=10;
    System.out.println(a<b);
    */

    //type promotion
    /* 
    int a = 10;
    float b = 20.25f;
    long c = 25;
    double d = 30;
    double ans = a+b+c+d;
    //all data type converted into double
    //because longest possible data type is double
    System.out.println(ans);
    */

    /* 

    char a = 'a';
    char b = 'b';
    System.out.println((int)(b));//integer value of b
    System.out.println((int)(a));//integer value of b
    System.out.println(b-a);//diffrent value of a and b
    System.out.println(a);//type promotion not done

    //type promotion only in expression not in single character
    */


    //type casting
    /* 
    float a = 12.33f;
    int b = (int)a;//java not allowed but we want to convert

    //conversion of charater to number is possible because in java 
    //charater is associated with a number in java 

    System.out.println(b);
    */


    // type conversion
    /* 
    int a =25;
    long b = a;//integer convert to long
    System.out.println(b);
    */

    
    // add two numbers
    /* 
    int a=10;
    int b=20;
    int sum=a+b;

    System.out.println(sum);
    */
    
    // input from user and add 2 numbers
    /* 
    Scanner sc = new Scanner(System.in);//sc=name of the scanner

    System.out.println("enter your 1st number");
    int a =sc.nextInt();
    System.out.println("enter your 2nd number");
    int b =sc.nextInt();
    int sum =a+b;

    System.out.println("sum is " + sum);
    */
  
    


  }
}
