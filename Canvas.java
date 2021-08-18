package com.javarush.task.task25.task2515;


public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }

    /**
     * Метод clear очищает матрицу, для новой отрисовки
     */
    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }

    /**
     * Метод drawMatrix рисует картинку в матрице
     * @param x - высота
     * @param y - ширина
     * @param matrix - матрица
     * @param c - цвет для точки, передаётся в метод setPoint
     */
    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    setPoint(x + j, y + i, c);
                }
            }
        }
    }

    /**
     * Метод setPoint отрисовывает точки в матрице заданным значением "с"
     * и проверяет корректно ли заданы координаты
     * @param x - координата X в матрице (ширина)
     * @param y - координата Y в матрице (высота)
     * @param c - цвет точки.
     */
    public void setPoint(double x, double y, char c) {
        int xRounded = (int) Math.round(x);
        int yRounded = (int) Math.round(y);
        if (xRounded >= 0 && xRounded < matrix[0].length && yRounded >= 0 && yRounded < matrix.length) {
            matrix[yRounded][xRounded] = c;
        }
    }

    /**
     * Вывод матрицы на экран
     */
    public void print() {
        System.out.println();

        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                System.out.print(" ");
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
