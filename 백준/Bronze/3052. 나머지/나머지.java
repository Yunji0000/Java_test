import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[10];
        int count =0;
        int doubleCount =0;
        
        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        
     
        for(int i=0; i<10; i++){
            doubleCount = 0;  
            
            for(int j=0; j<i; j++){
                
                if(arr[i] == arr[j]){
                    doubleCount++;
                    break;
                }
            }
            
            if(doubleCount == 0) {
                count++;
            }
        }
        
        bw.write(String.valueOf(count));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
