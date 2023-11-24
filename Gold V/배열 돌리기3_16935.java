import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    /**
     * 배열 상하 반전
     * 
     * @param arr
     * @return
     */
    public static int[][] upAndDown(int[][] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length - i - 1][j];
                arr[arr.length - i - 1][j] = temp;
            }
        }

        return arr;
    }

    /**
     * 배열 좌우 반전
     * 
     * @param arr
     * @return
     */
    public static int[][] leftAndRight(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length - 1 - j];
                arr[i][arr[0].length - 1 - j] = temp;
            }
        }

        return arr;
    }

    /**
     * 오른쪽으로 90도 회전
     * 
     * @param arr
     * @return
     */
    public static int[][] right(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][j] = arr[arr.length - 1 - j][i];
            }
        }

        return newArr;
    }

    /**
     * 왼쪽으로 90도 회전
     * 
     * @param arr
     * @return
     */
    public static int[][] left(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][j] = arr[j][arr[0].length - 1 - i];
            }
        }

        return newArr;
    }

    /**
     * 배열 4등분해서 시계방향으로 돌리기
     * 
     * @param arr
     * @return
     */
    public static int[][] quadrantRight(int[][] arr) {
        int row = arr[0].length / 2; // 가로 길이
        int column = arr.length / 2; // 세로 길이
        int[][] squareArr = new int[column][row];
        // 3사분면 저장하기
        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[0].length; j++) {
                squareArr[i][j] = arr[column + i][j];
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < squareArr.length; j++) {
                for (int k = 0; k < squareArr[0].length; k++) {
                    // 0 일때는
                    if (i == 0) {
                        arr[column + j][k] = arr[column + j][row + k];
                    } else if (i == 1) {
                        // System.out.print(i);
                        arr[column + j][row + k] = arr[j][row + k];
                    } else if (i == 2) {
                        // System.out.println(i);
                        arr[j][row + k] = arr[j][k];
                    }
                }
            }
        }

        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[0].length; j++) {
                arr[i][j] = squareArr[i][j];
            }
        }


        return arr;
    }

    /**
     * 배열 4등분해서 반시계방향으로 돌리기
     * 
     * @param arr
     * @return
     */
    public static int[][] quadrantLeft(int[][] arr) {
        int row = arr[0].length / 2; // 가로 길이
        int column = arr.length / 2; // 세로 길이
        int[][] squareArr = new int[column][row];
        // 3사분면 저장하기
        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[0].length; j++) {
                squareArr[i][j] = arr[column + i][j];
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < squareArr.length; j++) {
                for (int k = 0; k < squareArr[0].length; k++) {
                    // 0 일때는
                    if (i == 0) {
                        arr[j + column][k] = arr[j][k];
                    } else if (i == 1) {
                        arr[j][k] = arr[j][k + row];
                    } else if (i == 2) {
                        arr[j][k + row] = arr[j + column][k + row];
                    }
                }
            }
        }

        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr[0].length; j++) {
                arr[i + column][j + row] = squareArr[i][j];
            }
        }


        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {
            int num = Integer.parseInt(st.nextToken());

            switch (num) {
                case 1:
                    arr = upAndDown(arr);
                    break;
                case 2:
                    arr = leftAndRight(arr);
                    break;
                case 3:
                    arr = right(arr);
                    break;
                case 4:
                    arr = left(arr);
                    break;
                case 5:
                    arr = quadrantRight(arr);
                    break;
                case 6:
                    arr = quadrantLeft(arr);
                    break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                bw.write(String.valueOf(arr[i][j]) + " ");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
    }
}
