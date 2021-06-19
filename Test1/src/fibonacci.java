import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class fibonacci {

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w = new PrintWriter(System.out);
            
        int t = ip(br.readLine());
        
        while(t-- > 0) {
        	StringTokenizer st1 = new StringTokenizer(br.readLine());
        	int n = ip(st1.nextToken());
        	int k = ip(st1.nextToken());
              
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a[] = new int[n];
            for(int i=0;i<n;i++)
           	   a[i] = ip(st2.nextToken());
               
            int count = 0;
            for(int i=0;i<n;i++)
            	if(a[i]<=0)	count++;
            w.println(count < k ? "Dynamic" : "NOT Dynamic");
        }
            
        w.close();
            
    }
    
    public static int ip(String s){
        return Integer.parseInt(s);
    }
    
}

