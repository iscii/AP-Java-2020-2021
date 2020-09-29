public class Dog {
    private String dogName;
    private byte dogAge;
  
    public Dog(String name) { //constructor - called when object is instantiated
      dogName = name;
      dogAge = 1;
    }
    
    public void bark() {
      System.out.println("Woof");
    }
    public void birthday(byte count) {
      for(byte i = 0; i < count; i++){
        dogAge++;
      }
    }
    public void introduce() {
      System.out.println("Soy " + dogName + " y tengo " + dogAge + " anos");
    }
  }