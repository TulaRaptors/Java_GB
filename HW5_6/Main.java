package HW5_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] map = {
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 00, 00, 00, -1, 00, 00, 00, 00, 00, -1},
                {-1, 00, -1, -1, -1, 00, -1, -1, -1, 00, -1},
                {-1, 00, -1, 00, 00, 00, -1, 00, -1, 00, -1},
                {-1, 00, -1, -1, -1, 00, -1, -1, -1, 00, -1},
                {-1, 00, 00, 00, -1, 00, -1, 00, 00, 00, -1},
                {-1, 00, -1, -1, -1, 00, -1, 00, 00, 00, -1},
                {-1, 00, 00, 00, 00, 00, -1, 00, 00, 00, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
        };
        Printer(Queue(map));
    }


    public static void Printer(int[][] map) {
        int moves = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == -1) {
                    System.out.printf("▒▒▒");
                } else if (map[i][j] == 1) {
                    System.out.printf("๏̯͡๏");
                } else if (i == 7 & j == 9) {
                    System.out.printf("END");
                    moves = map[i][j];
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
        System.out.println("Количество ходов: " + moves);
    }

    public static int[][] Queue(int[][] map) {
        Queue<Integer> qm = new LinkedList<Integer>();
        Queue<Integer> qn = new LinkedList<Integer>();
        int m = 1;
        int n = 1;
        map[m][n] = 1;
        qm.add(m);
        qn.add(n);

        while (!qm.isEmpty()) {
            if (map[qm.element() - 1][qn.element()] != -1) {
                if (map[qm.element() - 1][qn.element()] == 0 ||
                        map[qm.element() - 1][qn.element()] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element() - 1][qn.element()] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element() - 1);
                    qn.add(qn.element());
                }
            }
            if (map[qm.element()][qn.element() + 1] != -1) {
                if (map[qm.element()][qn.element() + 1] == 0 ||
                        map[qm.element()][qn.element() + 1] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()][qn.element() + 1] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element());
                    qn.add(qn.element() + 1);
                }
            }
            if (map[qm.element() + 1][qn.element()] != -1) {
                if (map[qm.element() + 1][qn.element()] == 0 ||
                        map[qm.element() + 1][qn.element()] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element() + 1][qn.element()] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element() + 1);
                    qn.add(qn.element());
                }
            }
            if (map[qm.element()][qn.element() - 1] != -1) {
                if (map[qm.element()][qn.element() - 1] == 0 ||
                        map[qm.element()][qn.element() - 1] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()][qn.element() - 1] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element());
                    qn.add(qn.element() - 1);
                }
            }
            qm.remove();
            qn.remove();
        }
        return map;
    }
}