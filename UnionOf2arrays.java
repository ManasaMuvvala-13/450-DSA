/* take another array store both the arrays in that new array and sort the array ,if the adjacent elements are not equal then increment count */

import java.util.*;
public class UnionOf2arrays {
       public static void main(String[] args)
       {
           int m,n;
           Scanner sc=new Scanner(System.in);
            m=sc.nextInt();
            n=sc.nextInt();
            int a[]=new int[n];
           int b[]=new int[m];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
           }
            for(int i=0;i<m;i++)
           {
               b[i]=sc.nextInt();
           }     
         
           Union un=new Union();
   
           System.out.print(un.union(a,b,n,m));
       }
   
       
   }
   class Union
   {
    public  int union(int a[],int b[],int n,int m)
    {
      int c[]=new int[m+n];
      int j=0,count=1;
       for(int i=0;i<n;i++)
       {
           c[i]=a[i];
       }
       for(int i=n;i<n+m;i++)
       {
           c[i]=b[j++];
       }
       Arrays.sort(c);
       for(int i=1;i<n+m;i++)
       {
          if(c[i]!=c[i-1])
          count++;
       }
       return count;
    }
   
   }
   
    

