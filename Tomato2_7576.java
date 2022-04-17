package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

class tomato{
	int x;
	int y;
	
	tomato(int x, int y){
		this.x=x;
		this.y=y;
	}
}

public class Tomato2_7576 {
	public static int tomato[][];
	public static int M;
	public static int N;
	public static Queue<tomato> q;
	
	public static int[] dx= {-1,1,0,0};
	public static int[] dy= {-0,0,-1,1};
	
	
	
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		
		tomato=new int[N][M];
		q=new LinkedList<tomato>();
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				tomato[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(tomato[i][j]==1) {
					q.add(new tomato(i,j));
				}
			}
		}
		
		
		System.out.println(BFS());
	}
	
	public static int BFS() {
		while(!q.isEmpty()) {
			tomato t=q.remove();
			int x=t.x;
			int y=t.y;
			
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx>=0&&ny>=0&&nx<N&&ny<M) {
					if (tomato[nx][ny]==0) {
						q.add(new tomato(nx,ny));
						tomato[nx][ny]=tomato[x][y]+1;
					}
				}
			}
			
		}
		int result=Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(tomato[i][j]==0) {
					return -1;
				}
				result=Math.max(result, tomato[i][j]);
			}
		}
		
		if(result==1) {
			return 0;
		}
		else {
			return result-1;
		}
	}
}
