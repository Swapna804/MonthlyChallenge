// You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

// The area of an island is the number of cells with a value 1 in the island.

// Return the maximum area of an island in grid. If there is no island, return 0.
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length|| grid[i][j]==0){
            return 0;
        }
        
        grid[i][j]=0;
        int count=1;
        count+=dfs(grid,i+1,j);
         count+=dfs(grid,i-1,j);
         count+=dfs(grid,i,j+1);
         count+=dfs(grid,i,j-1);
         return count;
    }
}