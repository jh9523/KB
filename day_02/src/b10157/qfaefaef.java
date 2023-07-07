package b10157;

import java.util.Scanner;

public class qfaefaef {
	private static int[] di = new int[] {0, 1, 0, -1};
    private static int[] dj = new int[] {1, 0, -1, 0};

    public static void main(String[] args) {
        int n, m, target;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        target = sc.nextInt();
        int arr[][] = new int[n+1][m+1];
        if (n * m < target) {
            System.out.println(0);
            return;
        }
        int num = 1;
        int status = 0, i = 0, j = 0;
        while (true) {
            if (num == target) break;
            arr[i][j] = num++;
            if (status == 0 && (j == m-1 || arr[i][j+1] != 0)) status++;
            else if (status == 1 && (i == n-1 || arr[i+1][j] != 0)) status++;
            else if (status == 2 && (j == 0 || arr[i][j-1] != 0)) status++;
            else if (status == 3 && (i == 0 || arr[i-1][j] != 0)) status = 0;
            i = i + di[status];
            j = j + dj[status];
        }
        System.out.println((i+1) + " " + (j+1));
    }
}
