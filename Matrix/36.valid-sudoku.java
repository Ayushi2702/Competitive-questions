999999/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        
    //Step 1- initialize boolean matrices for rows , columns and sub Boxes.

    boolean[][] rows = new boolean[9][9];
    boolean[][] columns = new boolean[9][9];
    boolean[][] subBoxes = new boolean[9][9];

    //Step 2 : traverse over each cell in the 9 x 9 board

    for(int i=0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
           if(board[i][j]!='.')
           {
            int num = board[i][j] - '1';

            int boxIndex = (i/3)*3 + (j/3);

            if(rows[i][num] || columns[j][num] || subBoxes[boxIndex][num])
            {
                return false;
            }

            //step 5 : mark as seen.
            rows[i][num] = true;
            columns[j][num] = true;
            subBoxes[boxIndex][num] = true;
           }

           
        }
    }

    return true;

    }
}
// @lc code=end

