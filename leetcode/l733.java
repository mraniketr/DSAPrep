package leetcode;

import java.util.Arrays;

public class l733 {

    int c = 0;
    boolean first = true;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (first) {
            c = image[sr][sc];
            first = false;
        }
        if (image[sr][sc] == c)
            image[sr][sc] = color;
        else
            return image;

        try {
            floodFill(image, sr - 1, sc, color);
        } catch (Exception e) {
        }

        try {
            floodFill(image, sr + 1, sc, color);
        } catch (Exception e) {
        }

        try {
            floodFill(image, sr, sc - 1, color);
        } catch (Exception e) {
        }

        try {
            floodFill(image, sr, sc + 1, color);
        } catch (Exception e) {
        }

        return image;
    }

    public static void main(String[] args) {
        l733 sol = new l733();
        // int image[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int image[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        sol.floodFill(image, 1, 1, 0);
        for (int i = 0; i < image[0].length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println("");
        }
    }
}
