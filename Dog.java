public class Dog {
    // Characteristics
    private String name;
    private int age;
    private String color;
    private String size;

    // Constructor
    public Dog(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }
    // Methods
    public void bark() {
        System.out.println(name + " says: Bark! Bark!");
    }
    public void wagTail() {
        System.out.println(name + " is wagging their tail.");
    }
    public void lick() {
        System.out.println(name + " is licking their owner with love.");
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    // Main test method
    public static void main(String[] args) {
        Dog myDog = new Dog("Midnight", 5, "Black & Brown", "Medium");
        myDog.bark();
        myDog.wagTail();
        myDog.lick();

        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Color: " + myDog.getColor());
        System.out.println("Size: " + myDog.getSize());

        //Set dog name to another name
        myDog.setName("Just Dog");
        System.out.println("New name: " + myDog.getName());
    }
}