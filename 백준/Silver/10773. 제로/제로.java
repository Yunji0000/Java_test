import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int sum=0;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(input);
            }


        }

        while (!stack.isEmpty()){
            sum += stack.pop();
        }


            bw.write(String.valueOf(sum));


            br.close();
            bw.flush();
            bw.close();
    }
}
