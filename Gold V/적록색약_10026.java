import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static String[][] paint;
    public static boolean[][] check;
    public static int count;
    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {-1, 0, 1, 0};


    public void notDyschromatopsia(int x, int y, String color) {
        check[x][y] = true;

        for (int i = 0; i < dx.length; i++) {

            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < paint.length && cy < paint.length) {
                if (color.equals(paint[cx][cy]) && check[cx][cy] == false) {
                    notDyschromatopsia(cx, cy, paint[cx][cy]);
                }
            }
        }
    }

    public void dyschromatopsia(int x, int y, String color) {
        check[x][y] = true;

        for (int i = 0; i < dx.length; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < paint.length && cy < paint.length) {
                if ((color.equals(paint[cx][cy]) || (color.equals("G") && paint[cx][cy].equals("R"))
                                || (color.equals("R") && paint[cx][cy].equals("G"))) && check[cx][cy] == false) {
                    dyschromatopsia(cx, cy, paint[cx][cy]);
                }

            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Main mm = new Main();

        int n = Integer.parseInt(br.readLine());
        paint = new String[n][n];
        check = new boolean[n][n];

        // 입력 받기
        for (int i = 0; i < paint.length; i++) {
            String inputStr = br.readLine();
            for (int j = 0; j < paint[0].length; j++) {
                paint[i][j] = String.valueOf(inputStr.charAt(j));
            }
        }


        // false 초기화
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[0].length; j++) {
                check[i][j] = false;
            }
        }

        count = 0; // count 초기화

        for (int i = 0; i < paint.length; i++) {
            for (int j = 0; j < paint[0].length; j++) {
                if (check[i][j] == false) {
                    // 함수
                    count++;
                    // System.out.println("i :" + i + " j :" + j);
                    mm.notDyschromatopsia(i, j, paint[i][j]);
                }
            }
        }

        bw.write(String.valueOf(count) + " ");

        count = 0;

        // false 초기화
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[0].length; j++) {
                check[i][j] = false;
            }
        }

        for (int i = 0; i < paint.length; i++) {
            for (int j = 0; j < paint[0].length; j++) {
                if (check[i][j] == false) {
                    // 함수
                    count++;
                    mm.dyschromatopsia(i, j, paint[i][j]);
                }
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}
