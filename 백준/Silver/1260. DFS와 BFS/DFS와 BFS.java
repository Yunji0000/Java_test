import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V;
    //그래프 초기화
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static StringBuilder dfsResult = new StringBuilder();
    static StringBuilder bfsResult = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine
            ());
            
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken()) - 1; 
            
            
            for(int i=0; i<N; i++){
                graph.add(new ArrayList<>());
            }
            
            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken()) -1;
                int v = Integer.parseInt(st.nextToken()) -1; 
                
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            
            for(int i=0; i<N; i++){
                Collections.sort(graph.get(i));
            }
            
            visited = new boolean[N];
            dfs(V);
            bw.write(dfsResult.toString() +"\n");
            
            visited = new boolean[N];
            bfs(V);
            bw.write(bfsResult.toString() +"\n");
            
            
            br.close();
            bw.flush();
            bw.close();
            
            
            
    }
    
    private static void dfs(int node){
        visited[node] = true;
        
        dfsResult.append((node+1) + " ");
        
        for(int nei : graph.get(node)){
            if(!visited[nei]){
                dfs(nei);
            }
        }
    }
    
    private static void bfs(int start){
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        visited[start] = true;
        
        while(!que.isEmpty()){
            int node = que.poll();
            bfsResult.append((node+1) + " ");
            
            for(int nei : graph.get(node)){
                if(!visited[nei]){
                    visited[nei] = true;
                    que.add(nei);
                    }
            }
        }
    
    }
}
