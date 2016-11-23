/**
 * @author Hendrik Werner s4549775
 *
 * @param matrix M from the exercise
 * @param c C from the exercise
 * @param m end of C-path
 * @param n end of C-path
 * @param x current x position
 * @param y current y position
 * @param value the value we accumulated up to this point
 * @return the number of C-paths from x, y to m, n
 */
int findCPaths(
        int[][] matrix, int c, int m, int n,
        int x = 0, int y = 0, int value = 0
) {
    if (value > c || x > m || y > n) {
        return 0
    }
    int currentValue = value + matrix[x][y]
    if (x == m && y == n && currentValue == c) {
        return 1
    }
    findCPaths(matrix, c, m, n, x + 1, y, currentValue) +
            findCPaths(matrix, c, n, n, x, y + 1, currentValue)
}
