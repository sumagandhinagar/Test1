import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ordingterms
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int tc=Integer.parseInt(br.readLine());
	    while(tc-->0)
	    {
	        String []s1=br.readLine().split(" ");
	        String []s2=br.readLine().split(" ");
	        String []s3=br.readLine().split(" ");
	        
	        int []a=new int[3];
	        int []b=new int[3];
	        int []c=new int[3];
	        
	        for(int i=0;i<3;i++)
	        {
	            a[i]=Integer.parseInt(s1[i]);
	            b[i]=Integer.parseInt(s2[i]);
	            c[i]=Integer.parseInt(s3[i]);
	        }
	        
		    int flag=1;
	        int count1=0,count2=0;
	       
	        for(int i=0;i<3;i++)
	        {
	            if(a[i]>b[i])
	              count1++;
	            if(b[i]>a[i])
	              count2++;
	        }
	        if((count1>0 && count2>0)||(count1==0 && count2==0))
	            flag=0;
	             
	             
	      count1=0;count2=0;
	       
	        for(int i=0;i<3;i++)
	        {
	            if(b[i]>c[i])
	              count1++;
	            if(c[i]>b[i])
	              count2++;
	        }
	        if((count1>0 && count2>0)||(count1==0 && count2==0))
	             flag=0;
	             
	      count1=0;count2=0;
	       
	        for(int i=0;i<3;i++)
	        {
	            if(a[i]>c[i])
	              count1++;
	            if(c[i]>a[i])
	              count2++;
	        }
	        if((count1>0 && count2>0)||(count1==0 && count2==0))
	             flag=0;   
	             
	      if(flag==1)
	        System.out.println("yes");
	       else
	       System.out.println("no");
	    }
	}
}
