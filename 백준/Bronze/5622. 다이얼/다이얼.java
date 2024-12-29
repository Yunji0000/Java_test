   //1=2s -> 2 = 3s 시작
//ABC= 2 부터 -> 3개씩 알파벳 6번까지(MNO)
//PQRS = 7 -> 4개 9번까지

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            
            if(c=='A' || c=='B' || c=='C') {
                count += 3;
            }
            else if(c=='D' || c=='E' || c=='F') {
                count += 4;
            }
            else if(c=='G' || c=='H' || c=='I') {
                count += 5;
            }
            else if(c=='J' || c=='K' || c=='L') {
                count += 6;
            }
            else if(c=='M' || c=='N' || c=='O') {
                count += 7;
            }
            else if(c=='P' || c=='Q' || c=='R' || c=='S') {
                count += 8;
            }
            else if(c=='T' || c=='U' || c=='V') {
                count += 9;
            }
            else if(c=='W' || c=='X' || c=='Y' || c=='Z') {
                count += 10;
            }
        }

        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
