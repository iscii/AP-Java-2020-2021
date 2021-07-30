public class ExperimentalFarm
{
    private Plot[][] farmPlots;
    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }
    /**
     * Returns the plot with the highest yield for a given crop type, as described
     * in part (a).
     */
    public Plot getHighestYield(String c)
    {
        Plot p = null;
        for(int i=0;i<farmPlots.length;i++){
            for(int j=0;j<farmPlots[0].length;j++){
                if(p == null && farmPlots[i][j].getCropType().equals(c)){
                    p = farmPlots[i][j];
                }
                if(farmPlots[i][j].getCropType().equals(c) && farmPlots[i][j].getCropYield() > p.getCropYield()){
                    p = farmPlots[i][j];
                }
            }
        }
        return p;
    }
    /**
     * Returns true if all plots in a given column in the two-dimensional array
     * farmPlots
     * 
     * contain the same type of crop, or false otherwise, as described in part (b).
     * 
     */
    public boolean sameCrop(int col)
    {
        String s = farmPlots[0][col].getCropType();
        for(int i=1;i<farmPlots.length;i++){
            if(!farmPlots[i][col].getCropType().equals(s))
                return false;
        }
        return true;
    }
    public String toString() {
        String s="";
        for(int i=0;i<farmPlots.length;i++){
            for(int j=0;j<farmPlots[0].length;j++){
                s+=farmPlots[i][j].toString()+", ";
            }
            s+="\n";
        }
        return s;
    }
}