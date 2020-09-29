public class Cat {
    private String catName;
    private byte catAge;
  
    public Cat(String name) { //constructor - called when object is instantiated
      catName = name;
      catAge = 1;
    }
    
    public void meow() {
      System.out.println("Nyaa~");
    }
    public void birthday(byte count) {
      for(byte i = 0; i < count; i++){
        catAge++;
      }
    }
    public void introduce() {
      System.out.println("Soy " + catName + " y tengo " + catAge + " anos");
    }
  }