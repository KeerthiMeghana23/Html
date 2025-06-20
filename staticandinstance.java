  /* 1 .Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
    
class Static{
static int w=10;
static int x=20;
int y=30;
int z=40;
static
{
System.out.println("static block3");
}
static
{
System.out.println("static block4");
}
{
System.out.println("instance block3");
}
{
System.out.println("instance block4");
}
static  void add1(){
System.out.println(w+x);
}
static void  sub1(){
int a=200;
System.out.println(w-x);
}
void  mul1(){
System.out.println(y*z);
}
void div1(){
System.out.println(z/y);
}
public static void main(String args[])
{
Static s=new Static();
s.add1();
s.sub1();
s.mul1();
s.div1();
}
}

Output:
static block3
static block4
instance block3
instance block4
30
-10
1200
1    */


/*  2.Print instance variables in static methods

class Static 
{
    int x = 3;
    int y = 4;

    static void sta() 
    {
        Static s = new Static();  
        System.out.println(s.x);     
        System.out.println(s.y);         
    }

    public static void main(String[] args)
    {   
        System.out.println("Main Method");
        sta(); 
    }
}
 Output:
Main Method
3
4 */


/* 3.Print static variables in Instance methods
class Static 
{ 
    static int a=24;
    static int b=23;

    void ins()
    {
        System.out.println(a);
    }
    void inst()
    {
        System.out.println(b);
    }
public static  void main(String[]  args)
{
    
System.out.println("Static  Main Method");

Static s= new Static();
s.ins();
s.inst();

}
}
Output:
Static  Main Method
24
23 */



/* 4.Call instance methods in static methods 


class Static
{
    void instance() 
    {
        System.out.println("Instance method ");
    }

    static void staticmethod() 
    {

        Static s = new Static();
        s.instance();
    }

    public static void main(String[] args) {
        System.out.println(" Main Method");
        staticmethod();  
    }
}

Output:
Main Method
Instance method */

/* 5. Call static methods in instance methods 

class Static{
    
    static void a()
     {
        System.out.println("Static Method");
    }

    void ins() 
    {
        a();
    }

    public static void main(String[] args) {
        Static s = new Static();
        s.ins(); 
    }
}

Output:
Static Method
*/

/*  6. Print all the static, instance variables in main method 
class Static
{    
    static int a = 23;
    static int b = 17;
    int c = 3;
    int d = 14;

    public static void main(String[] args) {
        System.out.println("Static Variables:");
        System.out.println( a);
        System.out.println(b);

        Static s = new Static();

        System.out.println("Instance Variables:");
        System.out.println(s.c );
        System.out.println(s.d);
    }
}
Output:
Static Variables:
23
17
Instance Variables:
3
14 */



/* 7. Call static methods and instance methods in main method.



class Static
{
    static void greet()
    {
        System.out.println("Welcome");
    }
    void gre()
    {
        System.out.println("Back to home");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method");
        greet();
        Static s=new Static();
        s.gre();
    }
}

Output:
Main method
Welcome
Back to home */
