public class ItemGrid
{
    private Item[][] grid;

    // Constructor not shown

    /**
     * Returns true if xPos is a valid row index and yPos is a valid
     * 
     * column index and returns false otherwise.
     * 
     */

    public boolean isValid(int xPos, int yPos){
    }

    /**
     * Compares the item in row r and column c to the items to its
     * 
     * left and to its right. Returns the name of the item with
     * 
     * the greatest value, as described in part (a).
     * 
     * Precondition: r and c are valid indices
     * 
     */

    public String mostValuableNeighbor(int r, int c){
        if(!isValid(r, c)) return "Those are not valid coordinates";
        if(c == 0){
            return grid[r][c].getValue() > grid[r][c+1].getValue() ? grid[r][c].getName() : grid[r][c+1].getName();
        }
        else if(c == grid[r].length-1){
            return grid[r][c].getValue() > grid[r][c-1].getValue() ? grid[r][c].getName() : grid[r][c-1].getName();
        }
        else{
            if(grid[r][c].getValue() > grid[r][c-1].getValue() && grid[r][c].getValue() > grid[r][c+1].getValue())
                return grid[r][c].getName();
            else if(grid[r][c-1].getValue() > grid[r][c+1].getValue() && grid[r][c-1].getValue() > grid[r][c].getValue())
                return grid[r][c-1].getName();
            else
                return grid[r][c+1].getName();
        }
    }

    /**
     * Returns the average value of all the items in grid,
     * 
     * as described in part (b).
     * 
     */

    public double findAverage(){
        double n = 0;
        int c = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                n+=grid[i][j].getValue();
                c++;
            }
        }
        return n/c;
    }

}