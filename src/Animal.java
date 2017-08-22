//a class is like a blueprint for creating new instances of this class.. When the new keyword is called with this class it will create a new instance of this class with these fields.
public class Animal {

    //these are called fields
    private Boolean hasEyes;
    private Integer numberOfLegs;
    private String color;
    private String type;
    private String givenName;

    //constructor (just like a function)
    public Animal(Integer numberOfLegs, String color, String type, String givenName ){
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.type = type;
        this.givenName = givenName;
        this.hasEyes = true;
    }

    public void printAnimalInfo(){
        System.out.println("---------------------------------");
        System.out.println("name = " + givenName);
        System.out.println("color = " + color);
        System.out.println("number of legs = " + numberOfLegs);
        System.out.println("type = " + type);
        System.out.println("---------------------------------");

    }

}
