//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            System.out.println(new Sol().search(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < arr.length; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
}