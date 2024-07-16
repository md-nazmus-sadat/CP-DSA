//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends




class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int cnt=0;
        boolean flag=false;
        int i,n=s.length();
        for( i = 0; i < n;i++)
        {
            if(s.charAt(i) ==  ch)
            {
                cnt++;
            }
            if(cnt == count)
            {
                flag=true;
                break;
            }
            
        }
        if (flag==true)
        return s.substring(i+1);
        return "";
        
    }
}