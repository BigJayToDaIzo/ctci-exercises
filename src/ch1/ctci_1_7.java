package ch1;

public class ctci_1_7 {
    /*
    Given an image represented by an N x N matrix, where each pixel in the
    image is represented by an integer, write a method to rotate the image
    by 90 degrees.  Can you do this in place?
     */
    public static int[][] rotateMatrix(int[][] matrix)
    {
        int N = matrix[0].length - 1;
        int[][] newMatrix= new int[matrix[0].length][matrix[0].length];
        for(int y = 0; y <= N; y++)
        {
            for(int x = 0; x <= N; x++)
            {
                newMatrix[y][x] = matrix[N - x][y];
            }
        }
        return newMatrix;
    }
}
