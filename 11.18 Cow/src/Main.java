public class Main {
    public static void main(String[] args) throws Exception {
        Cow bessie = new Cow("holstein", "moo");    
        System.out.println(bessie.getSound());
        System.out.println(bessie.getType());
        bessie.milkCow();
        System.out.println(bessie.getNumMilkings());
        bessie.milkCow();
        bessie.milkCow();
        System.out.println(bessie.getNumMilkings());
    }
}
