package FBABCS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   
    // Complete the powerSum function below.
    static int powerSum(int X, int N, int num) {
        int val = (int) (X-Math.pow(num, N));
        if(val==0)
            return 1; 
        if(val<0)
            return 0; 
        
        return powerSum(val, N, num+1)+
            powerSum(X,N,num+1);
    }
    static int powerSum2(int X, int N){
        return powerSum(X,N,1); 
    }
    
    
//find the number of possible combinations for the sum of X recursively, where each int is raised to N power
    

private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum2(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}