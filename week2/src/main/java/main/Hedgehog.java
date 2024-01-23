package main;

class Hedgehog {
    private String name;
    private int age;
    
    //Default constructor
    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }
    
    // Parameterized constructor
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method: Speak
    public void speak(String message) {
        if (message.length() == 0) {
            System.out.println("I am " + name + " and my age is " + age + ", but could you still give me input values?");;
        }
        else {
            System.out.println(name + ": " + message);
        }
    }

    // Method: Run
    public void run(int laps){
        for (int i = 0; i < laps; i++) {
            System.out.println(name + " runs really fast!");
        }
    }
}
