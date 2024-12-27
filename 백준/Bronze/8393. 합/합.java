import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<=T; i++){
            sum += i;
            
        }
        System.out.println(sum);
        
        sc.close();
    }
    
}