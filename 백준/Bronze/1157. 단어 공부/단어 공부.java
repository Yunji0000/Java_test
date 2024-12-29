import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        String WORD = word.toUpperCase();


        int[] count = new int[26];


        for(int i=0; i<WORD.length(); i++) {
            char oneWord = WORD.charAt(i);

            for(int j=0; j<26; j++) {
                if(oneWord == ('A' + j)) {
                    count[j]++;
                    break;
                }
            }
        }


        int max = count[0];
        int result = 'A';


        for(int i=1; i <26; i++) {
            if(count[i] > max) {
                max = count[i];

                result = 'A' + i;
            }
            else if(count[i]== max) {
                result = '?';
            }
        }

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
