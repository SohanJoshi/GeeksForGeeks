package com.thirtydayleetcoding.may2020.week2;

public class FloodFill {
    int row , column, oldColor, newColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;

        this.row = image.length;
        this.column = image[0].length;
        this.oldColor = image[sr][sc];
        this.newColor = newColor;

        floodFillUtil(image, sr, sc);

        return image;
    }

    private void floodFillUtil(int[][] image, int r, int c) {
        if(r < 0 || c < 0 || r >= this.row || c >= this.column)
            return;

        if(image[r][c] != oldColor)
            return;

        image[r][c] = newColor;
        floodFillUtil(image, r - 1, c);
        floodFillUtil(image, r, c - 1);
        floodFillUtil(image, r + 1, c);
        floodFillUtil(image, r, c + 1);
    }
}
