class Patt
{
public static void main(String args[])
{ 
/* 1 int i,j;
for(i=0;i<6;i++)
{
for(j=0;j<6;j++)
{
System.out.print("*");}
System.out.println("");
}
}
}
Output:
******
******
******
******
******
******   */
/* 2 int i,j;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}
Output:
11111
22222
33333
44444
55555  */
/* 3 int i,j;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(j);
}
System.out.println();	
}
}
}
Output:
12345
12345
12345
12345
12345    */
/* 4 int i,j;
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
}
System.out.println();
}
}
}
Output:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25   */
/* 5 int i,j;
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+"");
n++;
if(n>9){
n=1;
}
}
System.out.println(" ");
}
}
}
Output:
12345
67891
23456
78912
34567    */
/* 6 int n=1;
int i,j;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n+=2;
}
System.out.println("");
}
}
}
Output:
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49    */
/* 7 int i,j;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
if(j%2==0)
{
System.out.print(0+"");
}else{
System.out.print(1+"");
}
}
System.out.println(" ");
}
}
}
Output:
10101
10101
10101
10101
10101     */
/* 19 int i,j;
for(i=0;i<=6;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");}
System.out.println(i);
}
}
}
Output:
0
*1
**2
***3
****4
*****5
******6  */
/* 8 for (int i=1; i<6; i++)
{
for (int j=1; j<6; j++)
{
if(j<6-i)
{
System.out.print(" ");
}
else
{
System.out.print("* ");
}
}
System.out.println();
}
}
}
Output:

    *
   * *
  * * *
 * * * *
* * * * *    */
/* 15 int n=7;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==n/2+1||j==n/2+4)
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}
Output:

      *
      *
      *
* * * * * * *
      *
      *
      *            */

/* 10 String word="INDIA";
for(int i=1;i<=word.length;i++)
{
System.out.println(word.substring(0,i));
}
}
} 
Output:
I
I N
I N D
I N D I
I N D I A     */


/* 14 for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
if(i==0||j==0||i==6-1||j==6-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println( );
}
}
}
output:
******
*    *
*    *
*    *
*    *
******           */

/* 14 for(int i=1;i<=7;i++)
{
for(int j=1;j<=7;j++)
{
if(i==1||i==7|| i==(7+1)/2||j==1 || j==7 || j==(7+1)/2)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println( );
}
}
}
output:
*******
*  *  *
*  *  *
*******
*  *  *
*  *  *
*******            */