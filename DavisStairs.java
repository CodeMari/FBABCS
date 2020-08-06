package FBABCS; 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DavisStairs{

    static int StepsToTake(int n){
        Integer[]memo =new Integer[n+1];
        memo[0]=1; 
        return doStepsToTake(n, memo);

    }
    private static int doStepsToTake(int n, Integer[]memo){
        if(n<0){
            return 0;
        }
        if(memo[n]==null){
            memo[n]= doStepsToTake(n-1, memo)
            +doStepsToTake(n-2, memo)
            +doStepsToTake(n-3, memo);
        }
        return memo[n];
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        BufferWriter bufferWriter = new BufferedWriter(newe FileWriter(System.getenv("OUTPUT_PATH")));
    
        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int sItr=0; sItr<s; sItr++){
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = StepsToTake(n);

            bufferWriter.write(String.valueOf(res));
            bufferWriter.newLine();
        }
        bufferWriter.close();
        scanner.close(); 

    }


}