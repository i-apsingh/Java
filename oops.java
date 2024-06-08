/* 
// use of Super keyword
// super constructor called automatically when you dont use super();
public class oops{
    public static void main(String[] args) {
        horse h = new horse();
    }
}

class animal{
    animal(){  // immediate parent class
        System.out.println("animal constructor is called");
    }
}

class horse extends animal{
    horse(){
        super();
        System.out.println("horse constructor is called");
    }
}
*/

/* 
// use of Static Keyword 
public class oops{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname ="JMV";

        Student s3 = new Student();
        s3.schoolname = "apple";

        System.out.println(s3.schoolname);

        Student s2 = new Student();
        System.out.println(s2.schoolname);

    }
}

class Student {
    String name;
    int roll;
    
    static String schoolname;

    void setname(String name){ // function getter
        this.name=name;
    }
    String getname(){ // function setter
        return this.name;
    }
}
*/

/* 
// interfaces 

interface chessplayer{
    void moves();
}

class queen implements chessplayer{
    public void moves(){
        System.out.println("up down left right diagonal and in all direction");
    }
}

class rook implements chessplayer{
    public void moves(){
        System.out.println("up down left right ");
    }
}

class king implements chessplayer{
    public void moves(){
        System.out.println("up down left right");
    }
}

public class oops {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}
*/

// abstraction
/* 
public class oops {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        // chicken c = new chicken();
        // c.eat();
        // c.walk();

    }
}
abstract class animal {
    // constructor 
    String color;
    animal(){
        color = "brown";
    }

    // non - abstract function/method
    void eat(){
        System.out.println("animal eats");
    }
    // abstract function/method
    abstract void walk();
}
class horse extends animal{
    void changecolor(){
        color = "dark browan";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class chicken extends animal{
    void changecolor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
*/

// funtion overriding
/* 
class animal {
    void eat (){
        System.out.println("eats anything ");
    }
}

class deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}

public class oops {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
    }
}
*/


// function overloading
/* 
// compile time polymorph
class calc {
    int sum (int a, int b){
        return a+b;
    }

    float sum (float a, float b){
        return a +b;
    }

    int sum(int a , int b, int c){
        return a+b+c;
    }
}

public class oops{
    public static void main(String[] args) {
        calc calculator = new calc();
        System.out.println(calculator.sum(1,2));
        System.out.println(calculator.sum((float)1.5, (float)2.5));
        System.out.println(calculator.sum(1,3,5));
    }
}
*/

// hirarichial inheritance
/* 
// base class
class animal{
    String colour ;
    void eat(){
        System.out.println("eats");
    }

    void breate(){
        System.out.println("breaths");
    }
}

class  mammals extends animal{
    void walk(){
        System.out.println("walks");
    }
}

class fish extends animal{
    void swim(){
        System.out.println("swims");
    }
}

class bird extends animal {
    void fly(){
        System.out.println("fly");
    }
}

class dog extends mammals{
    String breed;
}
// derived class

public class oops {
    public static void main(String args[]){
        dog dobby = new dog();
        dobby.eat();
        dobby.legs =4;
        System.out.println(dobby.legs);

    }
}
*/

/* 
// multilevel inheritance

// base class
class animal{
    String colour ;
    void eat(){
        System.out.println("eats");
    }

    void breate(){
        System.out.println("breaths");
    }
}

class  mammals extends animal{
    int legs;
}

class dog extends mammals{
    String breed;
}
// derived class

public class oops {
    public static void main(String args[]){
        dog dobby = new dog();
        dobby.eat();
        dobby.legs =4;
        System.out.println(dobby.legs);

    }
}
*/


// inheritance
/* 
// base class
class animal{
    String colour ;
    void eat(){
        System.out.println("eats");
    }

    void breate(){
        System.out.println("breaths");
    }
}

// derived class
class Fish extends animal {
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

public class oops {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}
*/

// copy constructors
/* 
class Student {
    String name ;
    int roll;
    String password;
    int marks[];

    // copy constructor
    Student (Student s1){
        marks = new int [3];
        this.name=s1.name;
        this.roll=s1.roll;
        
    }

    Student (){
        marks = new int [3];
        }
    
}

public class oops{
    public static void main(String args[]){

        Student s1=new Student();
        s1.name="abhishek";
        s1.roll=34;
        s1.password = "abcd";

        Student s2 = new Student(s1);
        s2.password ="xyz";

    }
}
*/

// constructor type
/* 
class Student {
    String name ;
    int roll;

    Student (){
        System.out.println("constructor is non parameterized ");
    }

    Student (String name ){ // this is parameterised constructor 
        this.name=name;
    }

    Student (int roll){ // this is also a parameterised constructor
        this.roll=roll; 
        
    }
    
}

public class oops{
    public static void main(String args[]){

        Student s1=new Student();
        Student s2=new Student("abhishek");
        Student s3 = new Student(123);

    }
}
*/

/*
// constructor
class Dog {
    String name;
    int age;

    // Constructor
    Dog(String name, int age) {
        this.name = name;  // Initialize the name property
        this.age = age;    // Initialize the age property
    }
}
public class oops{
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy", 3);  // Create a new Dog object using the constructor
        System.out.println("Name: " + myDog.name);  // Output: Buddy
        System.out.println("Age: " + myDog.age);    // Output: 3

    }
    
}
*/

// getters and setters
/* 
public class oops {
    public static void main (String args[]){

        Pen p1 =new Pen(); //pen objcet called p1
        p1.setcolour("blue");
        System.out.println(p1.getColor());

        p1.settip(5);
        System.out.println(p1.GetTip());

        p1.setcolour("yellow");;
        System.out.println(p1.getColor());
    
    }
}


class Pen{
    // properties and function in class
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    } // this is the getter by which you get the color 

    int GetTip(){
        return this.tip;
    } // getter by which we get the tip

    void setcolour(String newcolor){ 
        color = newcolor;
    }  // this is a stter by which we set the color of the pen

    void settip(int newtip){
        tip =newtip;
    }  // this is also the setter to set the tip of the pen
}
*/

/*  
public class oops {


    public static void main(String args[]){
        bankacc myacc =new bankacc();
        myacc.username ="abhishek";

        myacc.setpass("abhi1234");

    }

}


class bankacc{
    public String username;
    private String password;

    public void setpass(String pwd){
        password = pwd;
    }
}
*/

/*
public class oops {

    public static void main(String args[]){
        Pen p1= new Pen();
        p1.setcolour("blue");
        System.out.println(p1.color);

        p1.settip(5);
        System.out.println(p1.tip);
        
    }

}

class Pen{
    // properties and function in class
    String color;
    int tip;

    void setcolour(String newcolor){ 
        color = newcolor;
    }

    void settip(int newtip){
        tip =newtip;
    }
}

class Student{ // this is another object student like pen object
    String name;
    int age;
    float percentage;

    void calcpercentage(int phy, int che, int mateh){
        percentage =(phy+che+mateh)/3;
    }
}

*/