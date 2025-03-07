import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    //static int[] su;
    //static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    static boolean[] visited=new boolean[100001];
    
    
    
    public static void main(String[] args) throws IOException{
        // 코드를 작성해주세요
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st =new StringTokenizer(br.readLine());
        
        N =Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
        
        int result=bfs(N);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
        // bfs(N);
        
        // for(int )
            // if(bfs(N)==K){
                // count++
            // }
        
        
    }
    
    
    
    
    private static int bfs(int start){
        Queue<Integer> que=new LinkedList<>();
        que.add(start);
        visited[start] =true;
        int cnt = 0;
        while(!que.isEmpty()){
            
            int size=que.size();
            for (int i = 0; i < size; i++) {
                int X=que.poll();
        
                if(X==K){
                    return cnt;
                }
                int[] dx = {2*X, X-1, X+1};
                for(int target : dx){
                    
                    if(target>=0 &&target<=100000){
                        if(!visited[target]){
                            visited[target] = true;
                            que.add(target);
                        
                    }
                    }
                    
                }
            }
            cnt++;
        }
        return 0;
    }
}

