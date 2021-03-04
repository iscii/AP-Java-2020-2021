public class Item
{
    private String name;
    private int value;
    public Item(String itemName, int itemValue)
    {
        name = itemName;
        value = itemValue;
    }

    public String getName()
    {
        return name;
    }

    public int getValue()
    {
        return value;
    }

}
