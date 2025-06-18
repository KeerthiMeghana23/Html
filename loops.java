/* 1.class Loop{
public static void main(String[] args) {
for (int i=0;i<10;i++) {
System.out.println("Bright IT Career");
}
}
}

Output:
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career*/

/* 2.public class Loop {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
          System.out.println(i);
         i++;
        }
    }
}
 
Output:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20*/

/* 3.public class Loop{
public static void main(String args[])
{
    int a = 23;
    int b = 23;
    int c = 17;

  System.out.println("a is equal to b:" + (a==b));

  System.out.println("a is equal to c:" + (a==c));

  System.out.println("a is  not equal to b:" +  (a!=b));

  System.out.println("a is not equal to c:" + (a!=b));
 }
    
}
Output:
a is equal to b:true
a is equal to c:false
a is  not equal to b:false
a is not equal to c:true*/



/* 4.import java.util.Scanner; 
class  Loop{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
System.out.println("Even numbers are:");
for( int i=0;i<n;i++)
{
if(i%2==0)
{
System.out.println(i+ "");
}
}
System.out.println("Odd numbers are:");
for( int i=0;i<n;i++)
{
if(i%2!=0)
{
System.out.println(i+ "");
}
}
}
}

Output:
Enter the value of n:
10
Even numbers are:
0
2
4
6
8
Odd numbers are:
1
3
5
7
9*/

/* 5.class Loop{
public static void main(String args[]){
int a=23;
int b=17;
int c=12;
if((a>b)&&(a>c))
{
System.out.println("a is largest");
}
else if((b>a)&&(b>c)){
System.out.println("b is largest");
}
else{
System.out.println("c is largest");
}
}
}
 Output:
 a is largest*/


/* 6.import java.util.Scanner;
class Loop{
public static void main(String args[]){
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n between 10 to 100:");
n=s.nextInt();
while(n<=100){
if(n%2==0){
System.out.print(n + " ");
}
n++;
}
}
}  
Output:
Enter the value of n between 10 to 100:52
52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 */

/* 7.public class Loop{
public static void main(String args[]){
int i=1;
do{
System.out.println(i+ " ");
i++;
}while(i<=10);
}
}
Output:
1
2
3
4
5
6
7
8
9
10
 */

/*
 8.import java.util.Scanner;
public class Loop{
public static void main(String args[]){
int n,i,sum=0,rem;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
i=n;
while(n > 0)
{
rem=n%10;
sum+=(rem*rem*rem);
n/=10;
}
if(i==sum)
{
System.out.println(i +" is  an Armstrong");
}
else{
System.out.println(i +" is not an Armstrong");
}
}
}
Output:
Enter the value of n:
153
153 is  an Armstrong
*/

/* 9.import java.util.Scanner;
public class Loop{
public static void main(String args[])
{
int n ,i,count=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n % i==0){
count++;
}
}
if(count==2)
{
System.out.println( n +  "is a prime");
}
else{
System.out.println(n +  "is not a prime");
}
}
}

Output:
Enter the value of n:13
13 is a prime

Enter the value of n:15
15 is not a prime

Enter the value of n:23
23 is a prime

Enter the value of n:1
1 is not a prime */


/* 10.import java.util.Scanner;
public class Loop{
public static void main(String args[]){
int n,i,reversed=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
i=n;
while(n>0)
{
int digit=n%10;
reversed=(reversed*10)+digit;
n/=10;
}
if(i==reversed)
{
System.out.println(i + " is a palindrome ");
}
else{
System.out.println(i +  " is not a palindrome ");
}
}
} 
Output:
Enter the value of n:
151
151 is a palindrome */

/* 11.import java.util.Scanner;
public class Loop{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n = s.nextInt();
switch(n%2){
case 0:
System.out.println( n + " is an even number ");
break;
case 1:
System.out.println( n + " is an odd number ");
break;
default:
System.out.println("Invalid input");
}
s.close();
}
}
 Output:
Enter the value of n:
120
120 is an even number

Enter the value of n:
155
155 is an odd number */


/* 12.import java.util.Scanner;
public class Loop{
public static void main(String args[])
{
char gender;
Scanner s=new Scanner(System.in);
System.out.print("Enter the gender(M/F):");
char genderChar=s.next().charAt(0);
switch(genderChar)
{
case 'M':
case 'm':
System.out.println("Male");
break;
case 'F':
case 'f':
System.out.println("Female");
break;
default:
System.out.println("Transgender");
}
s.close();
}
}
  
Output:
Enter the gender(M/F):m
Male

Enter the gender(M/F):F
Female */
 
/* 13.class Loop{
public static void main(String args[])
{
int a=10;
int b=20;
int c=30;
if((a>b)&&(a>c))
{
System.out.println("a is largest");
}
else if((b>c)&&(b>a)){
System.out.println("b is largest");
}
else{
System.out.println("c is largest");
}
}
}

Output:
c is largest */


