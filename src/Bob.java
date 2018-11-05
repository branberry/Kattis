import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = input.readLine().split(" ");

        int x = Integer.parseInt(firstLine[0]);
        int y = Integer.parseInt(firstLine[1]);
        System.out.println(x);
        int[][] grid = new int[x][y];

        for (int i = 0; i < x; i++) {
            String[] currentValues = input.readLine().split(" ");
            for(int j = 0; j <y; j++) {
                grid[i][j] = Integer.parseInt(currentValues[j]);
            }
        }

    }
}
