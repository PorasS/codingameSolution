import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if(n==0){
            System.out.println(0);
            return;
        }
        int arr[]= new int[n];
        int ans[]=new int[2];
        int small=Integer.MAX_VALUE;
        int large= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            arr[i]=t;
        }

        for(int j=0;j<n;j++){
            if(arr[j]>0){
                if(arr[j]<small){
                small=arr[j];
                ans[0]=small; }
           
            }
            if(arr[j]<0){
                if(arr[j]>large){
                large=arr[j];
                ans[1]=large;
            }   
         }
        }

        if(ans[0]>0 && (Math.abs(ans[0])<Math.abs(ans[1]) || Math.abs(ans[0])==Math.abs(ans[1]))){
            System.out.println(ans[0]);
        }else{
            System.out.println(ans[1]);
        }
    }
}
