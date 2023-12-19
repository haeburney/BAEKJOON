package net.innofactory.lecture.hkim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] visited; // 방문 여부
    public static int[][] graph;
    public static int count;

    /**
     * 상하좌우로 이어져 있으면 탐색
     * 
     * @param x
     * @param y
     */
    public void dfs(int x, int y) {
        visited[x][y] = true;

        if (x - 1 >= 0) {
            if (graph[x - 1][y] == 1 && visited[x - 1][y] == false) {
                dfs(x - 1, y);
            }
        }

        if (x + 1 <= graph.length - 1) {
            if (graph[x + 1][y] == 1 && visited[x + 1][y] == false) {
                dfs(x + 1, y);
            }
        }

        if (y - 1 >= 0) {
            if (graph[x][y - 1] == 1 && visited[x][y - 1] == false) {
                dfs(x, y - 1);
            }
        }

        if (y + 1 <= graph[0].length - 1) {
            if (graph[x][y + 1] == 1 && visited[x][y + 1] == false) {
                dfs(x, y + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Main mm = new Main();

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

        for (int i = 0; i < T; i++) {
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            graph = new int[n + 1][m + 1];
            visited = new boolean[n + 1][m + 1];

            for (int j = 0; j < graph.length; j++) {
                for (int l = 0; l < graph[0].length; l++) {
                    visited[j][l] = false; // 방문여부 초기화
                }
            }

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[b][a] = 1;
            }

            for (int j = 0; j < graph.length; j++) {
                for (int l = 0; l < graph[0].length; l++) {
                    if (visited[j][l] == false && graph[j][l] == 1) {
                        mm.dfs(j, l);
                        count++;
                    }
                }
            }
            bw.write(String.valueOf(count) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
