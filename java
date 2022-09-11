import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
        int x=a;
        for(int k=0;k<n;k++){
            x+=b*Math.pow(2,k);
           System.out.print(x+" ");
        
        }
        System.out.println();
        }
        
        in.close();
    }
    
    
}
