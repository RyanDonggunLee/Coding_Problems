public class MinimumPathSum {
    public static int minPathSum(int[][] grid){
        int col = grid[0].length;
        int row = grid.length;

        for(int i = 1; i < col; i++) {
            System.out.println("bf " + grid[0][i]);
            grid[0][i] += grid[0][i-1];
            System.out.println(grid[0][i]);
        }


        for(int i = 1; i < row; i++) {
            System.out.println("row bf " + grid[i][0]);
            grid[i][0] += grid[i-1][0];
            System.out.println(grid[i][0]);
        }

        for(int i = 1; i < row; i++) {
            for(int j = 1; j < col; j++) {
                if (grid[i-1][j] > grid[i][j-1])
                    grid[i][j] += grid[i][j-1];
                else
                    grid[i][j] += grid[i-1][j];
            }
        }
        return grid[row-1][col-1];
    }
    public static void main(String[] args) {
        int[][] input = {{1,2},{5,6},{1,1}};
        System.out.println(minPathSum(input));
    }
}
