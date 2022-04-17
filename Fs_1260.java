package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Fs_1260 {
	public static boolean [] visited;
	public static int[][] graph;
	public static int N;
	public static int M;
	public static int V;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
	
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		V=Integer.parseInt(st.nextToken());
		
		graph=new int[N+1][N+1];
		visited=new boolean[N+1];
		
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			graph[a][b]=1;
			graph[b][a]=1;
		}
		
		Arrays.fill(visited, false);
		dfs(V);
		System.out.print("\n");
		
		Arrays.fill(visited, false);
		bfs(V);
		
	}
	
	public static void dfs(int v) {
		visited[v]=true;
		System.out.print(v+" ");
		
		for(int i=1;i<N+1;i++) {
			if(graph[v][i]==1&&visited[i]==false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int v) {
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(v);
		visited[v]=true;
		
		while(!queue.isEmpty()) {
			int r=queue.poll();
			System.out.print(r+" ");
			
			for(int i=1;i<=N;i++) {
				if(graph[r][i]==1&&visited[i]==false) {
					queue.add(i);
					visited[i]=true;
				}
			}
		}
	}
}
