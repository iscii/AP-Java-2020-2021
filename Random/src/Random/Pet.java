public class Pet

{

    private String name;

    private String species;

    public Pet(String n, String s)

    {

        name = n;

        species = s;

    }

    public String getName() {

        return name;

    }

    public void printPetInfo()

    {

        System.out.print(name + " is a " + species);

    }

}
