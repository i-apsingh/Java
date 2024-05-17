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