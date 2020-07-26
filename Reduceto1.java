package FBABCS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minStepsToOne' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER N as parameter.
     */

    public static int minStepsToOne(int N) {
    // Write your code here
        //check, if number is even, then divide by 2 
        if(N==1)
            return 0;
        else if(N % 2 ==0)
           return 1+ minStepsToOne(N/2);
        else
                return 1+Math.min(minStepsToOne(N-1), minStepsToOne(N+1));
            }
}
    

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.minStepsToOne(N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

