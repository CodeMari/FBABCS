package FBABCS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
  
       /* int n2 = n.length();
        int sum[]= new int[n2];
        sum[0]=n.charAt(0)-'0';
        int result=sum[0];
        
        for(int i=2; i<n2; i++){
            int numi = n.charAt(i)-'0';
            
            sum[i]=(i+1)*numi +10*sum[i-1];
            
            result+= sum[i];
            
        }
        return result;
    }
     */
        BigInteger n2 = new BigInteger(n);
        n2 = n2.multiply(new BigInteger(k + ""));
        n2 = n2.remainder(new BigInteger("9"));
        return n2.intValue() == 0 ? 9 : n2.intValue();
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}