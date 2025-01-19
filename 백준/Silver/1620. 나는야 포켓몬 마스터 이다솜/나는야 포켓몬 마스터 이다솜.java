import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        HashMap<Integer, String> num_name=new HashMap<>();
        HashMap<String,Integer> name_num=new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name=br.readLine();
            num_name.put(i,name);
            name_num.put(name,i);
        }

        for(int i = 0; i < M; i++) {
            String str = br.readLine();

            if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                int num = Integer.parseInt(str);
                bw.write(num_name.get(num)+ "\n");
            } else {
                bw.write(name_num.get(str) + "\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}