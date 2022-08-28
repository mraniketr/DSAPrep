package leetcode;

public class l200 {
    public static void main(String[] args) {
        SolutionF sol = new SolutionF();
        char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' } };
        System.out.println(sol.numIslands(grid));

    }
}

class SolutionF {
    public int numIslands(char[][] grid) {
        int c = grid[0].length;
        int r = grid.length;
        int ans = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] == '1') {
                    ans++;
                    updateGrid(i, j, grid);

                }

            }
        }

        return ans;
    }

    public void updateGrid(int x, int y, char[][] grid) {
        try {
            char k = grid[x][y];

        } catch (Exception e) {
            return;
        }
        if (grid[x][y] == '1') {
            grid[x][y] = '2';
            updateGrid(x - 1, y, grid);
            updateGrid(x, y - 1, grid);
            updateGrid(x + 1, y, grid);
            updateGrid(x, y + 1, grid);
        }

    }

}
