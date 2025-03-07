import java.io.*;
import java.util.*;

public class Main {
    static int N, V, count;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx={0,0,-1,1};
    static int[] dy= {-1,1,0, 0};
    // static int count=0;
    // static int result=0;
    
    public static void main(String[] args) throws IOException {
        // 코드를 작성해주세요
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        
        visited =new boolean[N][N];
        map =new int[N][N];
        
        for(int i=0; i<N; i++){
            String str =br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = str.charAt(j) -'0';
                
            // int n =Interger.parseInt(br.readLine());
            // int v= Integer.parseInt(br.readLine());
            
            //map[i][j]=Integer.parseInt(br.readLine());
            
            }
        }
        
         // dfs(N);
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<N; i++) { // 1인거 몇 개 출력
            for(int j=0; j<N; j++){
                if(!visited[i][j] && map[i][j]==1){
                    count=1;
                    dfs(i,j);
                    result.add(count); 
                }
            }
           
        }
        
        
       
        Collections.sort(result);
            
        bw.write(result.size()+"\n"); 
        
        for (int res : result) {
            bw.write(res +"\n");
        }
        
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static void dfs(int x, int y){
        visited[x][y]= true;
        for(int i=0; i<4; i++){
            int neiDx = x + dx[i];
            int neiDy = y + dy[i];
            
            if(neiDx>=0 && neiDx<N && neiDy>=0 && neiDy<N ){
                if(!visited[neiDx][neiDy] && map[neiDx][neiDy]==1){
                count++;
                dfs(neiDx, neiDy);
            }
        }
        }
        
        // return count; 
    }
}