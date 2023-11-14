package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static Set<Robot> robot = new HashSet<>();

    public static class Robot {
        int num;
        int x;
        int y;
        String way;


        public Robot(int num, int x, int y, String way) {
            super();
            this.num = num;
            this.x = x;
            this.y = y;
            this.way = way;
        }
    }

    /**
     * 반환값이 0이면 OK, 1이상이면 충돌, 1 이상은 로봇의 번호임
     * 
     * @param robotNum
     * @param way
     * @param length
     * @return
     */
    public static int[] move(int robotNum, String way, int length, int[][] field) {
        Robot targetRobot = findRobotByNum(robotNum);
        int[] answer = new int[2]; // 0 : 충돌한 로봇의 넘버, 1: 충돌당한 로봇의 넘버

        if (targetRobot != null) {
            int x = targetRobot.x;
            int y = targetRobot.y;
            //String currentWay = targetRobot.way;

            // way가 F면 이동, 다른거면 회전임
            // System.out.println("way :" + way + " /currnetWay :" + currentWay + " /x :" + x + " y :" + y);
            if (way.equals("F")) {
                switch (targetRobot.way) {
                    case "N": // y ++
                        // 다른 로봇과 부딪히는지
                        for (int i = 0; i < length; i++) {
                            field[x][y] = 0;
                            // 벽에 부딪히는지
                            if (field[0].length <= (y + 1)) {
                                answer[0] = targetRobot.num;
                                return answer;
                            }

                            if (field[x][y + 1] == 1) {
                                Robot crushedRobot = findCrushedRobotByNum(x, (y + 1));
                                if (crushedRobot != null) {
                                    answer[0] = targetRobot.num;
                                    answer[1] = crushedRobot.num;
                                }

                                return answer;
                            } else {
                                field[x][y + 1] = 1;
                                y++;
                                targetRobot.y++;
                            }
                        }
                        break;
                    case "W": // x --
                        // 다른 로봇과 부딪히는지
                        for (int i = 0; i < length; i++) {
                            field[x][y] = 0;
                            // 벽에 부딪히는지
                            if ((x - 1) < 0) {
                                answer[0] = targetRobot.num;
                                return answer;
                            }

                            if (field[x - 1][y] == 1) {
                                Robot crushedRobot = findCrushedRobotByNum((x - 1), y);
                                if (crushedRobot != null) {
                                    answer[0] = targetRobot.num;
                                    answer[1] = crushedRobot.num;
                                }
                                return answer;
                            } else {
                                field[x - 1][y] = 1;
                                x--;
                                targetRobot.x--;
                            }
                        }
                        break;
                    case "E": // x ++
                        // 다른 로봇과 부딪히는지
                        for (int i = 0; i < length; i++) {
                            field[x][y] = 0;
                            // 벽에 부딪히는지
                            if (field.length <= (x + 1)) {
                                answer[0] = targetRobot.num;
                                return answer;
                            }

                            if (field[x + 1][y] == 1) {
                                Robot crushedRobot = findCrushedRobotByNum((x + 1), y);
                                if (crushedRobot != null) {
                                    answer[0] = targetRobot.num;
                                    answer[1] = crushedRobot.num;
                                }
                                return answer;
                            } else {
                                field[x + 1][y] = 1;
                                x++;
                                targetRobot.x++;
                            }
                        }
                        break;
                    case "S": // y--
                        // 다른 로봇과 부딪히는지
                        for (int i = 0; i < length; i++) {
                            field[x][y] = 0;
                            // 벽에 부딪히는지
                            if ((y - 1) < 0) {
                                answer[0] = targetRobot.num;
                                return answer;
                            }

                            if (field[x][y - 1] == 1) {
                                Robot crushedRobot = findCrushedRobotByNum(x, (y - 1));
                                if (crushedRobot != null) {
                                    answer[0] = targetRobot.num;
                                    answer[1] = crushedRobot.num;
                                }
                                return answer;
                            } else {
                                field[x][y - 1] = 1;
                                y--;
                                targetRobot.y--;
                            }
                        }
                        break;
                }
                // System.out.println("이동한 위치 : x :" + x + " y :" + y);
            } else {
                for (int i = 0; i < length % 4; i++) {
                    String currentWay2 = targetRobot.way;
                    String findWayValue = findWay(currentWay2, way);
                    if (!findWayValue.equals("")) {
                        targetRobot.way = findWayValue;
                    }
                    // System.out.println(targetRobot.way);
                }
            }

        }

        return answer;
    }

    /**
     * num으로 로봇 찾기
     * 
     * @param num
     * @return
     */
    public static Robot findRobotByNum(int num) {
        for (Robot r : robot) {
            if (r.num == num) {
                return r;
            }
        }
        return null;
    }

    /**
     * 좌표로 로봇 찾기
     * 
     * @param x
     * @param y
     * @return
     */
    public static Robot findCrushedRobotByNum(int x, int y) {
        for (Robot r : robot) {
            if (r.x == x && r.y == y) {
                return r;
            }
        }
        return null;
    }


    /**
     * 방향 정하기
     * 
     * @param currentWay
     * @param changeWay
     * @return
     */
    public static String findWay(String currentWay, String changeWay) {
        switch (currentWay) {
            case "N":
                switch (changeWay) {
                    case "L":
                        return "W";
                    case "R":
                        return "E";
                }
                break;
            case "W":
                switch (changeWay) {
                    case "L":
                        return "S";
                    case "R":
                        return "N";
                }
                break;
            case "E":
                switch (changeWay) {
                    case "L":
                        return "N";
                    case "R":
                        return "S";
                }
                break;
            case "S":
                switch (changeWay) {
                    case "L":
                        return "E";
                    case "R":
                        return "W";
                }
                break;
        }

        return "";
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] field = new int[a][b];

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            String way = st.nextToken();
            field[x - 1][y - 1] = 1;
            // Robot r = new Robot();
            Robot r = new Robot(i, (x - 1), (y - 1), way);
            robot.add(r); // 로봇의 개수만큼 추가
        }



        int[] answer = new int[2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int robotNum = Integer.parseInt(st.nextToken());
            String way = st.nextToken();
            int length = Integer.parseInt(st.nextToken());

            answer = move(robotNum, way, length, field);

            // bw.write(String.valueOf(answer[0]) + ", " + String.valueOf(answer[1]) + "\n");

            if (answer[0] != 0 && answer[1] == 0) {
                // System.out.println("Robot " + answer[0] + " crashes into the wall");
                bw.write("Robot " + String.valueOf(answer[0]) + " crashes into the wall\n");
                break;
            } else if (answer[1] != 0) {
                // System.out.println("Robot " + answer[0] + " crashes into robot " + answer[1]);
                bw.write("Robot " + String.valueOf(answer[0]) + " crashes into robot " + String.valueOf(answer[1]) + "\n");
                break;
            }

        }
           
        if (answer[0] == 0 && answer[1] == 0) {
            bw.write("OK\n");
            // System.out.println("OK");
        }


        bw.flush();
        bw.close();
    }
}
