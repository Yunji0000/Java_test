import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            System.out.println(A+B);
        }
        sc.close();
    }
}