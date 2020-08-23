import java.io.*; 
import java.util.*; 

public class QtwoStacks{
    public static void maiin(String[]args){
        Scanner sc= new Scanner(System.in);; 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 

        int bottom =-1; ;
        int top=0; 

        for(int i=0; i<n; i++)
        {
            int ops=sc.nextInt(); 
            if(ops==1)
            {
                int num= sc.nextInt();
                arr[++bottom]=num;  
            }
            else if(ops==2)
            {
                int num=arr[top++];;

            }
            else{
                System.out.println(arr[top]);
            }
        }
    }
}