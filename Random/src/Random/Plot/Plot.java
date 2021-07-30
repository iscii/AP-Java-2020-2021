public class Plot
{
    private String cropType;
    private int cropYield;
    public Plot(String crop, int yield)
    {
        cropType = crop;
        cropYield = yield;
    }
    /**
     * returns crop type
     * @return cropType
     */
    public String getCropType()
    {
        return cropType;
    }
    /**
     * returns crop yield
     * @return cropYield
     */
    public int getCropYield()
    {
        return cropYield;
    }
    public String toString(){
        return cropType + " : " + cropYield;
    }
}