/* 1.
public class Array
{
public static void main(String[] args)
{
int a[]=new int[5];
int sum=0;
a[0]=10;
a[1]=15;
a[2]=25;
a[3]=30;
a[4]=35;
sum=a[0]+a[1]+a[2]+a[3]+a[4];
System.out.println("The sum is:" +sum);
}
}

Output:
The sum is:115 */



 /* 2.
public class Array
{
public static void main(String args[])
{
int sum=0;
float avg;
int a[]=new int[5];
int length=a.length;
a[0]=10;
a[1]=15;
a[2]=25;
a[3]=30;
a[4]=35;
sum=a[0]+a[1]+a[2]+a[3]+a[4];
avg=sum/length;
System.out.println("The average is " +avg);
}
}
Output:
The average is 23.0 */

/* 3.import java.util.Scanner;
public class Array{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
int a[]={10,20,30,40,50};
for(int i=0;i<a.length;i++)
{
if(a[i]==n)
{
System.out.println("The index value of " + a[i]  +  " is " +  i);
}
}
}
}
Output:
Enter the value of n:20
The index value of 20 is 1 */

/*4.import java.util.Scanner;
public class Array{
public static void main(String args[])
{
int n;
boolean found=false;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
int a[]={10,20,30,40,50};
for(int i=0;i<a.length;i++)
{
if(a[i]==n)
{
found = true;
}
}
if(found)
{
System.out.println("found a specified value ");
}
else {
System.out.println(" not found a specified value");
}
}
}
Output:
Enter the value of n:20
found a specified value

Enter the value of n:60
not found a specified value */
 


/*5.
import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
int a[]={23,17,3,14,12};
System.out.print("Enter the value of n to remove from an array:");
n=s.nextInt();
int arr[]=new int[a.length-1];
for(int i=0,k=0;i<a.length;i++)
{
if(a[i]!=n)
{
 arr[k]=a[i];
 k++;
}
}
System.out.println("Array after removal:"); 
for(int val: arr )
{
System.out.println(val+ " ");
}
}
}

Output:
Enter the value of n to remove from an array: 3
Array after removal:
23
17
14
12 */

/*6.import java.util.Scanner;
 public class Array
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("Enter the values of an array:"); 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Display the values of an array a:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Display the values of an array b:");
for(i=0;i<n;i++)
{
System.out.println(b[i]=a[i]);
}
s.close();
}
}
Output:
Enter the size of an array:5
Enter the values of an array:1
2
3
4
5
Display the values of an array a:
1
2
3
4
5
Display the values of an array b:
1
2
3
4
5*/


/*7.
import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
int n,position;
Scanner s=new Scanner(System.in);
int a[]={23,17,3,14,12};
System.out.print("Enter the value of n to insert into an array:");
n=s.nextInt();
System.out.print("Enter the position (0 to " + a.length + ") to insert n: ");
position=s.nextInt();
int arr[]=new int[a.length+1];
for(int i=0,k=0;i<arr.length;i++)
{
if(i == position)
{
 arr[i]=n;
}
else{
arr[i]=a[k];
k++;
}
}
System.out.println("Array after insertion:"); 
for(int val: arr )
{
System.out.println(val+ " ");
}
}
}
Output:
Enter the value of n to insert into an array:25
Enter the position (0 to 5) to insert n: 2
Array after insertion:
23
17
25
3
14/* 
 
/* 8.import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
System.out.print("Enter the values of an array:"); 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int min = a[0];
int max = a[0];
for (i = 1; i < n; i++) 
{
if (a[i] < min) 
min = a[i];
}
else if (a[i] > max) {
max = a[i];
}
}
System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
}
}
Output:
Enter the size of an array:5
Enter the values of an array:11 22 33 44 55
Minimum value: 11
Maximum value: 55 */



/* 9.import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
System.out.print("Enter the values of an array:"); 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Display the values of an array in reverse order:");
for(i=n-1;i>=0;i--)
{
System.out.println(a[i] + "");
}
s.close();
}
}

Enter the size of an array:5
Enter the values of an array:11 22 33
44 55
Display the values of an array in reverse order:
55
44
33
22
11 */

/*10.import java.util.Scanner;
class Array{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter  the size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter  the elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = sc.nextInt();
}
boolean foundDuplicate = false;
System.out.println("Duplicate elements:");
for (int i = 0; i < n; i++) {
boolean isDuplicate = false;
for (int k = 0; k < i; k++) {
if (arr[i] == arr[k]) {
isDuplicate = true;
break;
}
}
if (!isDuplicate) {
for (int j = i + 1; j < n; j++) 
{
if (arr[i] == arr[j]) 
{
System.out.println(arr[i]);
foundDuplicate = true;
break;
}
}
}
}
if (!foundDuplicate) {
System.out.println("No duplicates found.");
}
}
} 
Output:
Enter  the size: 6
Enter  the elements:
11 22 33 11 11 22
Duplicate elements:
11
22 */


/* 11.public class Array{
public static void main(String[] args) {
int arr1[]={10,20,30,40,50};
int arr2[]={10,20,30,60,70};
System.out.println("Common elements:");
for(int i=0; i<arr1.length; i++) 
{ 
for(int j=0; j<arr2.length; j++) 
{ 
if(arr1[i]==arr2[j])
{
System.out.println(arr1[i]);
}
}
}
}
}
Output:
Common elements:
10
20
30 */


/* 12.import java.util.Scanner;
class Array{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter  the size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter  the elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = sc.nextInt();
}
System.out.print("Array without duplicates: ");
for(int i=0; i<n; i++) 
{
boolean isDuplicate = false;
for(int j=0; j<i; j++) {
if(arr[i]==arr[j]) 
{
isDuplicate = true;
break;
}
}
if(!isDuplicate)
{
System.out.print(arr[i] + " ");
}
}
}
}
Output:
Enter  the size: 8
Enter  the elements:
11 22 33 22 33 33 11 44
Array without duplicates: 11 22 33 44 */

/* 13.
public class Array
{
public static void main(String args[])
{
int a[]={44,55,67,78,89};
int largest=0;
int secondlargest=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>largest)
{
secondlargest=largest;
largest=a[i];
}
else if((a[i]>secondlargest) && (a[i]!=largest)){
secondlargest=a[i];
}
}
System.out.println("The second largest number is " +secondlargest);
}
}
 
Output:
The second largest number is 78 */

/* 14.public class Array
{
public static void main(String args[])
{
int a[]={99,11,56,78,100};
int largest=0;
int secondlargest=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>largest)
{
secondlargest=largest;
largest=a[i];
}
else if((a[i]>secondlargest) && (a[i]!=largest)){
secondlargest=a[i];
}
}
System.out.println("The second largest number is " +secondlargest);
}
}
Output:
The second largest number is 99 */


 
/* 15.import java.util.Scanner;
public class Array{
public static void main(String args[])
{
int n,i,evencount=0,oddcount=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of an array:");
n=s.nextInt();
System.out.println("Enter the elements of an array:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++){
if(a[i]%2==0)
{
evencount++;
}
else{
oddcount++;
}
}
System.out.println("The number of even values are:" + evencount);
System.out.println("The number of odd values are: "+ oddcount);
}
}
Output:
Enter the size of an array:
5
Enter the elements of an array:
11
22
33
44
55
The number of even values are:2
The number of odd values are: 3 */
  
/* 16.import java.util.Scanner;
public class Array {
public static void main(String args[]) {
int n, i;
Scanner s = new Scanner(System.in);
System.out.print("Enter the size of an array: ");
n = s.nextInt();
int a[] = new int[n];
System.out.print("Enter the values of an array: ");
for(i = 0; i < n; i++) 
{
a[i] = s.nextInt();
}
int min = a[0];
int max = a[0];
int diff=0;
for(i = 1; i < n; i++) 
{
if (a[i] < min) 
{
min = a[i];            
} 
else if (a[i] > max) {
max = a[i];
}
}
diff=max-min;
System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
System.out.println("The difference is " + diff);
}
} 
Output:
Enter the size of an array: 5
Enter the values of an array: 11 22 33 44 55
Minimum value: 11
Maximum value: 55
The difference is 44 */



/* 17.import java.util.Scanner;
public class Array{
public static void main(String args[])
{
int n1,n2;
boolean foundn1=false;
boolean foundn2=false;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n1:");
n1=s.nextInt();
System.out.print("Enter the value of n2:");
n2=s.nextInt();
int a[]={12,17,23,24,29};
for(int i=0;i<a.length;i++)
{
if(a[i]==n1){
foundn1 = true;
}
if(a[i]==n1){
foundn2 = true;
}
}
if(foundn1 && foundn2)
{
System.out.println("found a specified values ");
}
else {
System.out.println(" not found a specified values");
}
}
}
Output:
Enter the value of n1:12
Enter the value of n2:23
found a specified values  */


/* 18.import java.util.Scanner;
class Array{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter  the size: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter  the elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = s.nextInt();
}
System.out.print("Array without duplicates: ");
for(int i=0; i<n; i++) 
{
boolean isDuplicate = false;
for(int j=0; j<i; j++) {
if(arr[i]==arr[j]) 
{
isDuplicate = true;
break;
}
}
if(!isDuplicate)
{
System.out.print(arr[i] + " ");
}
}
}
}
Output:
Enter  the size: 5
Enter  the elements:
22 33 44 33 22
Array without duplicates: 22 33 44 */


/*19.
import java.util.Scanner;
public class Array {
public static void main(String args[]) {
int n, i;
int actual_sum = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the value of n:");
n = s.nextInt();
int[] a = new int[n - 1];         
int index = 0;
for (i = 1; i <= n; i++) {
if (i != 23) {
a[index++] = i;
}
}
for (int num : a) {
actual_sum += num;
}
int total_sum = n * (n + 1) / 2;
int missing_number = total_sum - actual_sum;
System.out.println("The missing number is: " + missing_number);
}
}

Output:
Enter the value of n:
100
The missing number is: 23 */
