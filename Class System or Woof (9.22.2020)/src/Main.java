class Main {
    public static void main(String[] args) {
      Dog snoopy = new Dog("snoopy");
      snoopy.birthday((byte)2);
  
      Cat pepe = new Cat("pepe");
      pepe.birthday((byte)5);

      Household household = new Household(snoopy, pepe);
      household.rollCall();
    }
  }