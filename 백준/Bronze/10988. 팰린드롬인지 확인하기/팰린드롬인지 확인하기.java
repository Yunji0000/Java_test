import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String word = br.readLine();
        char[] arr = word.toCharArray();
        
        for(int i=0; i<arr.length/2; i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        
        String changeWord = new String(arr);
        
        if(changeWord.equals(word)){
            bw.write("1");
        }
        else{
            bw.write("0");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}