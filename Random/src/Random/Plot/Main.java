public class Main {
    // Create an array that matches the output in the checklist
    // Be sure to add Java Docs if any are missing.
    public static void main(String[] args) {
        Plot[][] plotArr = { { new Plot("corn", 20), new Plot("corn", 30), new Plot("peas", 20) },
                            { new Plot("peas", 30), new Plot("corn", 40), new Plot("corn", 62) },
                            { new Plot("wheat", 10), new Plot("corn", 50), new Plot("rice", 30) },
                            { new Plot("corn", 55), new Plot("corn", 30), new Plot("peas", 30) } };
        // Construct a new ExperimentalFarm object f
        ExperimentalFarm f = new ExperimentalFarm(plotArr);
        // print all the output here to match the checklist on classroom
        System.out.println(f);

        System.out.println(f.getHighestYield("corn")); //62
        System.out.println(f.getHighestYield("peas")); //30
        System.out.println(f.getHighestYield("bananas")); //null
        System.out.println(f.sameCrop(0)); //false
        System.out.println(f.sameCrop(1)); //true

        System.out.println(f.getHighestYield("rice")); //30
        System.out.println(f.sameCrop(2)); //false
    }
}
